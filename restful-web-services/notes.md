create table user (
id integer not null,
birth_date timestamp,
name varchar(255),
primary key (id)
);

create table post (
id integer not null, 
description varchar(255), 
user_id integer, 
primary key (id)
);

alter table post 
add constraint post_to_user_foreign_key
foreign key (user_id) references user;