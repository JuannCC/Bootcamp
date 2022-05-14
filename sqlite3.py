import sqlite3

conn=sqlite3.connect("miaplic.db")
cursor= conn.cursor()

rows=cursor.execute('SELECT * FROM alumnos WHERE nombre="fran"')

for row in rows:
   print(row)


cursor.close()
conn.close()
