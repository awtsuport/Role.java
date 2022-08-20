

create table userAccount(
    user_id serial not null primary key ,
    user_name varchar(150) not null ,
    user_email varchar(100) not null ,
    user_password varchar(150) not null ,
    user_gender varchar(100) not null ,
    user_generator varchar(250) not null ,
    user_image  varchar(100) not null ,
    date_creat int  not null
);