{\rtf1\ansi\ansicpg1252\cocoartf2709
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fnil\fcharset0 Menlo-Bold;\f1\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red56\green185\blue199;\red0\green0\blue0;\red57\green192\blue38;
\red86\green32\blue244;\red219\green39\blue218;}
{\*\expandedcolortbl;;\cssrgb\c25546\c77007\c82023;\csgray\c0;\cssrgb\c25706\c77963\c19557;
\cssrgb\c41681\c25958\c96648;\cssrgb\c89513\c29736\c88485;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx560\tx1120\tx1680\tx2240\tx2800\tx3360\tx3920\tx4480\tx5040\tx5600\tx6160\tx6720\pardirnatural\partightenfactor0

\f0\b\fs22 \cf2 \CocoaLigature0 from
\f1\b0 \cf3  flask 
\f0\b \cf2 import
\f1\b0 \cf3  Flask, request, jsonify\

\f0\b \cf2 import
\f1\b0 \cf3  sys\

\f0\b \cf2 import
\f1\b0 \cf3  datetime\

\f0\b \cf2 import
\f1\b0 \cf3  sqlite3\

\f0\b \cf2 import
\f1\b0 \cf3  pytz\
\
app = Flask(__name__)\
\
@app.route(
\f0\b \cf4 '/api/receive_data'
\f1\b0 \cf3 , methods=[
\f0\b \cf4 'POST'
\f1\b0 \cf3 ])\

\f0\b \cf2 def\cf5  receive_json
\f1\b0 \cf3 ():\
    
\f0\b \cf2 try
\f1\b0 \cf3 :\
\
            data = request.json\
            measure = data[
\f0\b \cf4 'measure'
\f1\b0 \cf3 ]\
            unit = data[
\f0\b \cf4 'unit'
\f1\b0 \cf3 ]\
            turkish_time = pytz.timezone(
\f0\b \cf4 'Europe/Istanbul'
\f1\b0 \cf3 )\
            timeonTurkey = datetime.datetime.now(turkish_time)\
            conn = sqlite3.connect(
\f0\b \cf4 'healthcare.db'
\f1\b0 \cf3 )\
            cursor = conn.cursor()\
\
            cursor.execute(
\f0\b \cf4 "INSERT INTO measurement (weight,weight_type,date_of_measurement) VALUES (?,?,?)"
\f1\b0 \cf3 , (measure,unit,timeonTurkey))\
            conn.commit()\
            cursor.close()\
\
            print(
\f0\b \cf4 "Received JSON data:"
\f1\b0 \cf3 , data)\
            
\f0\b \cf2 return
\f1\b0 \cf3  jsonify(\{
\f0\b \cf4 "message"
\f1\b0 \cf3 : 
\f0\b \cf4 "Data received successfully"
\f1\b0 \cf3 \}), 200\
    
\f0\b \cf2 except
\f1\b0 \cf3  Exception 
\f0\b \cf2 as
\f1\b0 \cf3  e:\
            
\f0\b \cf2 return
\f1\b0 \cf3  jsonify(\{
\f0\b \cf4 "error"
\f1\b0 \cf3 : str(e)\}), 400\
\

\f0\b \cf2 if
\f1\b0 \cf3  __name__ == 
\f0\b \cf4 '__main__'
\f1\b0 \cf3 :\
    app.run(host=
\f0\b \cf4 '0.0.0.0'
\f1\b0 \cf3 , port=80, debug=
\f0\b \cf6 True
\f1\b0 \cf3 )\
\
}