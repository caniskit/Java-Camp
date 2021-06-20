drop table public."users";
CREATE TABLE IF NOT EXISTS public."users"
(
	user_id bigserial not null primary key,
	mail varchar(50) not null,
	mail_verify BOOL DEFAULT FALSE,
	password varchar(25) not null,
	UNIQUE(mail)
);

drop table IF EXISTS public."seekers";
create table if not exists public."seekers"
(
	
	user_id BIGINT NOT NULL,
	first_name VARCHAR(30) NOT NULL,
	last_name VARCHAR(30) NOT NULL,
	nationality_id BIGINT not null,
	year_of_birth INT NOT NULL,
	UNIQUE(nationality_id),
	UNIQUE(user_id),
	CONSTRAINT fk_user
		FOREIGN KEY(user_id)
			REFERENCES public.users(user_id)
);

DROP TABLE IF EXISTS public."employers";
CREATE TABLE IF NOT EXISTS public."employers"(
	user_id BIGINT NOT NULL,
	business_name varchar(40) not null,
	web_site varchar(60) not null,
	phone varchar(15) not null,
	system_verify BOOL DEFAULT FALSE,
	UNIQUE(user_id),
	CONSTRAINT fk_user
		FOREIGN KEY(user_id)
			REFERENCES public.users(user_id)
);

DROP TABLE IF EXISTS public."system_user";
CREATE TABLE IF NOT EXISTS public."system_user"(
	
	user_id BIGINT NOT NULL,
	first_name VARCHAR(30) NOT NULL,
	last_name VARCHAR(30) NOT NULL,	
	UNIQUE(user_id),
	CONSTRAINT fk_user
		FOREIGN KEY(user_id)
			REFERENCES public.users(user_id)
);


DROP TABLE IF EXISTS public."job_positions"
CREATE TABLE IF NOT EXISTS public."job_positions"(
position_id serial not null primary key,
	position_name varchar(30) not null unique 
);