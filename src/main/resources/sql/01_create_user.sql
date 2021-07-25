-- database 목록 보기
show databases;

-- 새로운 database 생성
create database my_board;

-- mysql database 사용
use mysql;

-- 현재 사용자 확인
select host, user from user;

-- Application User 생성 및 권한 부여
create user 'user2'@'%' identified by 'user2@123';
show grants for 'user2'@'%';
grant all on * to 'user2'@'%';
FLUSH privileges;

