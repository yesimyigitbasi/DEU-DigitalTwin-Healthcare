from flask import Flask, request, jsonify
import sys
import datetime
import sqlite3
import pytz

app = Flask(__name__)

@app.route('/api/receive_data', methods=['POST'])
def receive_json():
    try:

            data = request.json
            measure = data['measure']
            unit = data['unit']
            turkish_time = pytz.timezone('Europe/Istanbul')
            timeonTurkey = datetime.datetime.now(turkish_time)
            conn = sqlite3.connect('healthcare.db')
            cursor = conn.cursor()

            cursor.execute("INSERT INTO measurement (weight,weight_type,date_of_measurement) VALUES (?,?,?)", (measure,unit,timeonTurkey))
            conn.commit()
            cursor.close()

            print("Received JSON data:", data)
            return jsonify({"message": "Data received successfully"}), 200
    except Exception as e:
            return jsonify({"error": str(e)}), 400

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=80, debug=True)

