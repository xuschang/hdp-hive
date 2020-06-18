set hive.mapred.mode=nonstrict;
DROP TABLE IF EXISTS DECIMAL_5_n0;

CREATE TABLE DECIMAL_5_n0(key decimal(10,5), value int)
ROW FORMAT DELIMITED
   FIELDS TERMINATED BY ' '
STORED AS TEXTFILE;

LOAD DATA LOCAL INPATH '../../data/files/kv7.txt' INTO TABLE DECIMAL_5_n0;

SELECT key FROM DECIMAL_5_n0 ORDER BY key;

SELECT DISTINCT key FROM DECIMAL_5_n0 ORDER BY key;

SELECT cast(key as decimal) FROM DECIMAL_5_n0;

SELECT cast(key as decimal(6,3)) FROM DECIMAL_5_n0;

DROP TABLE DECIMAL_5_n0;
