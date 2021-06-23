DROP TABLE IF EXISTS t_user;
create table T_USER
(
  id          NUMBER primary key ,
  user_name   varchar(50) comment '用户名',
  order_no    varchar(50),
  create_time timestamp default sysdate
);
-- DELETE FROM t_user;