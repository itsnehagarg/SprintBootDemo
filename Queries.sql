insert into users(username, password) values('general', '$2a$12$0HjuY0r8yA48P8QGwPx7LeounGBjifbK4GAXptVlq.Z0aUv8IwMPa');

-- password = admin -- 3
insert into users(username, password) values('admin', '$2a$12$GVWikMQClUBtvi30mRoOeuQRAJc.yq.j0qKXTzOrPxdMk8TLM2jSy');


insert into roles(name) values('ADMIN');

insert into roles(name) values('USER');

insert into users_roles(user_id, role_id) values(3,1); -- admin userid=3, roleid=1
insert into users_roles(user_id, role_id) values(2, 2); -- general userid=2, roleid=2
