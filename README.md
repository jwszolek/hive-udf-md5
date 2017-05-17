# hive-udf-md5

UDF function compatible with Hive 1.1 that allows you to use MD5 encryption.

## Build
This is how you can build the project

```
git clone https://github.com/jwszolek/hive-udf-md5.git
cd ./hive-udf-md5
mvn clean install
```

## How to use it

```
hive> ADD JAR /tmp/hive-udf-md5-1.0-SNAPSHOT-jar-with-dependencies.jar;
hive> CREATE TEMPORARY FUNCTION md5enc as ‘com.jwszol.Md5enc’;
hive> select md5enc(table_name) from testing_table;
```

expeceted output:

```
Total MapReduce CPU Time Spent: 2 seconds 990 msec
OK
e3e0b65493bf8e35fe2a1bba0e19d644
e3e0b65493bf8e35fe2a1bba0e19d644
576b842382842db219be4baf763aaa85
e54436b40a886231fac87b37df288516
5b923446f3402cd72f58ff2f9147e993
76eaa3e9479d0b2ab218a9cd212ed395
84d54dbf45e73a1e33fd3fc563e4c096
576b842382842db219be4baf763aaa85
e54436b40a886231fac87b37df288516
5b923446f3402cd72f58ff2f9147e993
76eaa3e9479d0b2ab218a9cd212ed395
84d54dbf45e73a1e33fd3fc563e4c096
e3e0b65493bf8e35fe2a1bba0e19d644
576b842382842db219be4baf763aaa85
e3e0b65493bf8e35fe2a1bba0e19d644
c37c9a0a991e2f48fc92dcdb88b667ee
c37c9a0a991e2f48fc92dcdb88b667ee
e54436b40a886231fac87b37df288516
5b923446f3402cd72f58ff2f9147e993
76eaa3e9479d0b2ab218a9cd212ed395
84d54dbf45e73a1e33fd3fc563e4c096
Time taken: 76.691 seconds, Fetched: 21 row(s)
```





