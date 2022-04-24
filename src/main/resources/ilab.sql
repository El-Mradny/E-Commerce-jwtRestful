DROP TABLE CARTITEM IF exists;
DROP TABLE CART IF exists;
DROP TABLE DISCOUNT IF exists;
DROP TABLE NORMAL IF exists;
-- DROP TABLE DIAGNOSTICPACKET IF exists;
-- DROP TABLE PACKET IF exists;
-- DROP TABLE CATEGORYDIAGNOSTIC IF exists;
DROP TABLE DIAGNOSTIC IF exists;
DROP TABLE TUBE IF exists;
-- DROP TABLE CATEGORY IF exists;
DROP TABLE REPRESENTATIVE IF exists;
DROP TABLE PHYSICIAN IF exists;
drop table PATIENT if exists;
drop table USER if exists;

CREATE TABLE USER
(
    ID    				VARCHAR(255) not null primary key,
    FIRSTNAME  			VARCHAR(255),
    LASTNAME 			VARCHAR(255),
    ROLE  				VARCHAR(255) not null,
    PICTURE 			VARCHAR(255),
    GENDER 				VARCHAR(10),
    BIRTHDATE 			TIMESTAMP,
    CREATED 			TIMESTAMP
);

insert into USER (ID, FIRSTNAME, ROLE, PICTURE, GENDER, LASTNAME, BIRTHDATE, CREATED) VALUES ('joe@joe.com', 'Joe', 'Customer', '/images/joe.jpeg','Male','jack',date '1998-03-16',date '2021-03-15');
insert into USER (ID, FIRSTNAME, ROLE, PICTURE, GENDER, LASTNAME, BIRTHDATE, CREATED) VALUES ('ann@ann.com', 'Ann', 'Customer', '/images/UsersPictureann@ann.com.jpg','Female','john',date '1998-01-27',date '2021-01-15');
insert into USER (ID, FIRSTNAME, ROLE, PICTURE, GENDER, LASTNAME, BIRTHDATE, CREATED) VALUES ('fred@fred.com', 'Fred', 'Support', '/images/UsersPictureDefault.png','Male','joe',date '2022-01-10',date '2021-03-15');
insert into USER (ID, FIRSTNAME, ROLE, PICTURE, GENDER, LASTNAME, BIRTHDATE, CREATED) VALUES ('admin@admin.com', 'Admin', 'Admin', '/images/UsersPictureDefault.png','Female','',date '2021-03-15',date '2021-03-15');
insert into USER (ID, FIRSTNAME, ROLE, PICTURE, GENDER, LASTNAME, BIRTHDATE, CREATED) VALUES ('jack@jack.com', 'Jack', 'Supplier', '/images/UsersPictureDefault.png','Male','zayan',date '2021-03-15',date '2021-03-15');
insert into USER (ID, FIRSTNAME, ROLE, PICTURE, GENDER, LASTNAME, BIRTHDATE, CREATED) VALUES ('abdullah@abdullah.com', 'abdullah', 'Customer', '/images/abdullah.jpeg','Male','Ail',date '1997-01-25',date '2021-03-15');
insert into USER (ID, FIRSTNAME, ROLE, PICTURE, GENDER, LASTNAME, BIRTHDATE, CREATED) VALUES ('jackson@jackson.com', 'jackson', 'Customer', '/images/UsersPictureDefault.png','Male','john',date '1995-03-01',date '2021-03-15');
insert into USER (ID, FIRSTNAME, ROLE, PICTURE, GENDER, LASTNAME, BIRTHDATE, CREATED) VALUES ('sara@sara.com', 'Sara', 'Customer', '/images/joe.jpeg','Female','ahmad',date '1996-07-10',date '2021-03-15');
insert into USER (ID, FIRSTNAME, ROLE, PICTURE, GENDER, LASTNAME, BIRTHDATE, CREATED) VALUES ('meena@meena.com', 'meena', 'Customer', '/images/UsersPictureDefault.png','Female','ikram',date '1996-07-10',date '2021-03-15');



CREATE TABLE PATIENT
(
    ID    				BIGINT not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 22022000001),
    NAME  				VARCHAR(255) not null,
    AGE					INT not null,
    EMAIL				VARCHAR(50) null,
    GENDER 				VARCHAR(10),
    PHONE				VARCHAR(10) null,
    NOTE 				VARCHAR(255) null,
    CREATED 			TIMESTAMP
);

insert into PATIENT (NAME, AGE, EMAIL, GENDER, PHONE, NOTE, CREATED) VALUES('Ahmed Ismail', 37,'' , 'Male', 01112223680, '',date '2022-03-15');
insert into PATIENT (NAME, AGE, EMAIL, GENDER, PHONE, NOTE, CREATED) VALUES('Mazen Ahmed', 14,'', 'Male', 01016704210, '',date '2022-03-04');
insert into PATIENT (NAME, AGE, EMAIL, GENDER, PHONE, NOTE, CREATED) VALUES('Nadia Mohamed', 65,'', 'Male', 01226415891, '',date '2022-03-04');
insert into PATIENT (NAME, AGE, EMAIL, GENDER, PHONE, NOTE, CREATED) VALUES('Ismail Farag', 70,'', 'Male', 01000236755, '',date '2022-03-04');
insert into PATIENT (NAME, AGE, EMAIL, GENDER, PHONE, NOTE, CREATED) VALUES('Mai Mohamed', 36,'', 'Male', 01113656266, '',date '2022-03-04');
insert into PATIENT (NAME, AGE, EMAIL, GENDER, PHONE, NOTE, CREATED) VALUES('Ahmed Ismail', 37,'', 'Male', 01011223344, '',date '2022-03-04');
insert into PATIENT (NAME, AGE, EMAIL, GENDER, PHONE, NOTE, CREATED) VALUES('Ahmed Ismail', 37,'', 'Male', 01011223344, '',date '2022-03-04');



CREATE TABLE PHYSICIAN
(
    ID 			BIGINT  not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 221000001),
    NAME 		VARCHAR(255) not null,
    SPECIALTY	VARCHAR(50) null,
    ADDRESS		VARCHAR(225) null,
    NOTE		VARCHAR(255) null
);


insert into PHYSICIAN (NAME, SPECIALTY, ADDRESS, NOTE) VALUES ('Mostafa Mohmaed Ali', 'Dermatologist','', '');
insert into PHYSICIAN (NAME, SPECIALTY, ADDRESS, NOTE) VALUES ('Trent Alexendar Arnold', 'Urologists','', '');
insert into PHYSICIAN (NAME, SPECIALTY, ADDRESS, NOTE) VALUES ('Luna James', 'Endocrinologists','', '');
insert into PHYSICIAN (NAME, SPECIALTY, ADDRESS, NOTE) VALUES ('Virgil Van-Dik', 'Nephrologists','', '');
insert into PHYSICIAN (NAME, SPECIALTY, ADDRESS, NOTE) VALUES ('Alison Baker', 'Gastroenterologists','', '');
insert into PHYSICIAN (NAME, SPECIALTY, ADDRESS, NOTE) VALUES ('Rebortson', 'Dermatologist','', '');
insert into PHYSICIAN (NAME, SPECIALTY, ADDRESS, NOTE) VALUES ('Henderson', 'Infectious disease','', '');
insert into PHYSICIAN (NAME, SPECIALTY, ADDRESS, NOTE) VALUES ('Sadu Mane', 'Ophthalmologists','', '');
insert into PHYSICIAN (NAME, SPECIALTY, ADDRESS, NOTE) VALUES ('Luis Diaz', 'Obstetrician/gynecologists','', '');
insert into PHYSICIAN (NAME, SPECIALTY, ADDRESS, NOTE) VALUES ('Origie', 'Cardiologists','', '');
insert into PHYSICIAN (NAME, SPECIALTY, ADDRESS, NOTE) VALUES ('Harvey Elliott', 'Pulmonologists','', '');
insert into PHYSICIAN (NAME, SPECIALTY, ADDRESS, NOTE) VALUES ('Thiago Alcântara', 'Otolaryngologists','', '');
insert into PHYSICIAN (NAME, SPECIALTY, ADDRESS, NOTE) VALUES ('Caoimhin Kelleher', 'Neurologists','', '');
insert into PHYSICIAN (NAME, SPECIALTY, ADDRESS, NOTE) VALUES ('Diogo Jota', 'General surgeons','', '');
insert into PHYSICIAN (NAME, SPECIALTY, ADDRESS, NOTE) VALUES ('Roberto Firmino', 'Orthopedic','', '');
insert into PHYSICIAN (NAME, SPECIALTY, ADDRESS, NOTE) VALUES ('Ibrahima Konaté', 'Cardiac surgeons','', '');
insert into PHYSICIAN (NAME, SPECIALTY, ADDRESS, NOTE) VALUES ('Naby Keïta', 'Allergists','', '');




CREATE TABLE REPRESENTATIVE
(
    ID 			BIGINT  not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 221000001),
    NAME 		VARCHAR(255) not null,
    PHONE		VARCHAR(25) null,
    GENDER		VARCHAR(225) null,
    NOTE		VARCHAR(255) null
);
insert into REPRESENTATIVE (NAME, PHONE, GENDER, NOTE) VALUES ('Mostafa Mohmaed', '01113331112', 'Male', 'This guy is perfect ');
insert into REPRESENTATIVE (NAME, PHONE, GENDER, NOTE) VALUES ('Omar Ahmed', '0116666112', 'Male', 'Wondeful ');
insert into REPRESENTATIVE (NAME, PHONE, GENDER, NOTE) VALUES ('Islam Adel', '01155555512', 'Male', 'Amazing');


-- CREATE TABLE CATEGORY  --Test Category
-- (
--     ID 			BIGINT  not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 201),
--     NAME 		VARCHAR(255) not null
-- );
--
-- insert into CATEGORY (NAME) VALUES ('Clinical Biochemistry');
-- insert into CATEGORY (NAME) VALUES ('Microbiology');
-- insert into CATEGORY (NAME) VALUES ('Haematology');
-- insert into CATEGORY (NAME) VALUES ('Human Molecular');
-- insert into CATEGORY (NAME) VALUES ('Anatomical Pathology');
-- insert into CATEGORY (NAME) VALUES ('Pathology Service');
-- insert into CATEGORY (NAME) VALUES ('Others');

CREATE TABLE TUBE  --Test Collection Tube
(
    ID 			BIGINT  not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 101),
    NAME 		VARCHAR(255) not null,
    IMAGE 		VARCHAR(255) not null
);

insert into TUBE (NAME, IMAGE) VALUES ('SST', '');
insert into TUBE (NAME, IMAGE) VALUES ('EDTA', '');
insert into TUBE (NAME, IMAGE) VALUES ('CSF', '');
insert into TUBE (NAME, IMAGE) VALUES ('Lithium Heparin', '');
insert into TUBE (NAME, IMAGE) VALUES ('Plain tube', '');


CREATE TABLE DIAGNOSTIC
(
    ID 			BIGINT  not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 501),
    NAME 		VARCHAR(255) not null,
    TUBEID		BIGINT not null REFERENCES TUBE(ID),
    SPECIMEN	VARCHAR(255) not null,
    SHORT		VARCHAR(255) not null,
    TRANSPORT	VARCHAR(255) null,
    PRICE		DOUBLE
);

insert into DIAGNOSTIC (NAME, TUBEID, SPECIMEN, SHORT, TRANSPORT, PRICE) VALUES ( 'Albumin', 102, 'Blood', 'LFT', '', 20); -- 501
insert into DIAGNOSTIC (NAME, TUBEID, SPECIMEN, SHORT, TRANSPORT, PRICE) VALUES ( 'GPT', 101, 'Blood', 'LFT', '', 20); --502
insert into DIAGNOSTIC (NAME, TUBEID, SPECIMEN, SHORT, TRANSPORT, PRICE) VALUES ( 'GOT', 102, 'Blood', 'LFT', '', 20);  --503
insert into DIAGNOSTIC (NAME, TUBEID, SPECIMEN, SHORT, TRANSPORT, PRICE) VALUES ( 'Creatinine', 103, 'Blood', 'LFT', '', 20);  --504
insert into DIAGNOSTIC (NAME, TUBEID, SPECIMEN, SHORT, TRANSPORT, PRICE) VALUES ( 'Urea', 101, 'Blood', 'LFT', '', 20); --505
insert into DIAGNOSTIC (NAME, TUBEID, SPECIMEN, SHORT, TRANSPORT, PRICE) VALUES ( 'ALKALINE PHOSPHATASE', 101, 'Blood', 'LFT', '', 20);  --506
insert into DIAGNOSTIC (NAME, TUBEID, SPECIMEN, SHORT, TRANSPORT, PRICE) VALUES ( 'GGT', 101, 'Blood', 'LFT', '', 20); --507


-- CREATE TABLE CATEGORYDIAGNOSTIC
-- (
--     ID 				BIGINT  not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 301),
--     DIAGNOSTICID 	BIGINT not null REFERENCES DIAGNOSTIC(ID),
--     CATEGORYID		BIGINT not null REFERENCES CATEGORY(ID)
-- );

-- insert into CATEGORYDIAGNOSTIC (DIAGNOSTICID, CATEGORYID) VALUES (501, 202);
-- insert into CATEGORYDIAGNOSTIC (DIAGNOSTICID, CATEGORYID) VALUES (502, 202);
-- insert into CATEGORYDIAGNOSTIC (DIAGNOSTICID, CATEGORYID) VALUES (503, 202);
-- insert into CATEGORYDIAGNOSTIC (DIAGNOSTICID, CATEGORYID) VALUES (504, 202);
-- insert into CATEGORYDIAGNOSTIC (DIAGNOSTICID, CATEGORYID) VALUES (505, 201);


--
-- CREATE TABLE PACKET
-- (
--     ID BIGINT not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 301),
--     NAME VARCHAR(255) not null
-- );
--
-- insert into PACKET (NAME) VALUES ('Liver Function');
-- insert into PACKET (NAME) VALUES ('Kidney Function');
-- insert into PACKET (NAME) VALUES ('Lipids');


--
-- CREATE TABLE DIAGNOSTICPACKET
-- (
--     ID 				BIGINT not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 301),
--     DIAGNOSTICID 	BIGINT not null REFERENCES DIAGNOSTIC(ID),
--     PACKETID 		BIGINT not null REFERENCES PACKET(ID)
-- );
-- insert into DIAGNOSTICPACKET (DIAGNOSTICID, PACKETID) VALUES (502,301);
-- insert into DIAGNOSTICPACKET (DIAGNOSTICID, PACKETID) VALUES (503,301);
-- insert into DIAGNOSTICPACKET (DIAGNOSTICID, PACKETID) VALUES (506,301);
--






CREATE TABLE NORMAL
(
    ID 			BIGINT  not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1001),
    TESTID 		BIGINT not null REFERENCES DIAGNOSTIC(ID),
    AGE			INT not null,
    NOTE		VARCHAR(255)
);
insert into NORMAL (TESTID, AGE, NOTE) VALUES ( 501, 1, '25 - 46 g/L');
insert into NORMAL (TESTID, AGE, NOTE) VALUES ( 501, 8, '35 - 45 g/L');
insert into NORMAL (TESTID, AGE, NOTE) VALUES ( 501, 15, '37 - 47 g/L');
insert into NORMAL (TESTID, AGE, NOTE) VALUES ( 501, 100, '35 - 49 g/L');


CREATE TABLE DISCOUNT
(
    ID  			BIGINT not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 500),
    DISCOUNTVALUE 	DECIMAL,
    STARTDATE     	TIMESTAMP,
    ENDDATE       	TIMESTAMP,
    PUBLISH 		VARCHAR(255),
    description  	VARCHAR(255),
    discountCode  	VARCHAR(255)

);

insert into DISCOUNT (DISCOUNTVALUE, STARTDATE, ENDDATE ,PUBLISH,description, discountCode)
values (1.2, date '2022-01-01', date '2022-03-15','Published','heyy we have offer','VTHY67');

insert into DISCOUNT (DISCOUNTVALUE, STARTDATE, ENDDATE,PUBLISH,description, discountCode)
values (3.2,date'2022-01-01', date '2022-02-15','Published','heyy we have amzing offer','QW34DF');

insert into DISCOUNT (DISCOUNTVALUE, STARTDATE, ENDDATE,PUBLISH,description, discountCode)
values (2.4,date'2022-11-01', date '2022-11-18','Not Published','heyy we have now offer','DRG7');

insert into DISCOUNT (DISCOUNTVALUE, STARTDATE, ENDDATE,PUBLISH,description, discountCode)
values (2.4,date'2022-03-28', date '2022-06-06','Published','heyy we have now offer FOR YOU','AMNAXX20');



CREATE TABLE CART
(
    ID 				BIGINT  not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 5202200001),
    USERID          VARCHAR(255) not null REFERENCES USER(ID),
    PATIENTID		BIGINT not null REFERENCES PATIENT(ID),
    PHYSICIANID		BIGINT not null REFERENCES PHYSICIAN(ID),
    REPID			BIGINT null REFERENCES REPRESENTATIVE(ID),
    DISCOUNTID		BIGINT null REFERENCES DISCOUNT(ID),
    TOTAL			DOUBLE NULL,
    DISCOUNT		DOUBLE NULL,
    STATUS			VARCHAR(50) not null,
    CREATED			TIMESTAMP not null,
    UPDATED			TIMESTAMP not null
);

insert into CART (USERID, PATIENTID, PHYSICIANID, REPID, DISCOUNTID, TOTAL, DISCOUNT, STATUS, CREATED, UPDATED)
VALUES ('joe@joe.com', 22022000002, 221000001, 221000001,null , null, null, 'open', date '2022-03-06' , date '2022-03-06');

-- insert into CART (USERID, PATIENTID, PHYSICIANID, REPID, DISCOUNTID, TOTAL, DISCOUNT, STATUS, CREATED, UPDATED)
-- VALUES ('joe@joe.com', 22022000002, 221000001, 221000001,null , null, null, 'open', date '2022-03-06' , date '2022-03-06');
--
-- insert into CART (USERID, PATIENTID, PHYSICIANID, REPID, DISCOUNTID, TOTAL, DISCOUNT, STATUS, CREATED, UPDATED)
-- VALUES ('joe@joe.com', 22022000002, 221000001, 221000001,null , null, null, 'open', date '2022-03-06' , date '2022-03-06');
--
-- insert into CART (USERID, PATIENTID, PHYSICIANID, REPID, DISCOUNTID, TOTAL, DISCOUNT, STATUS, CREATED, UPDATED)
-- VALUES ('joe@joe.com', 22022000002, 221000001, 221000001,null , null, null, 'open', date '2022-03-06' , date '2022-03-06');
--
-- insert into CART (USERID, PATIENTID, PHYSICIANID, REPID, DISCOUNTID, TOTAL, DISCOUNT, STATUS, CREATED, UPDATED)
-- VALUES ('joe@joe.com', 22022000002, 221000001, 221000001,null , null, null, 'open', date '2022-03-06' , date '2022-03-06');
--
-- insert into CART (USERID, PATIENTID, PHYSICIANID, REPID, DISCOUNTID, TOTAL, DISCOUNT, STATUS, CREATED, UPDATED)
-- VALUES ('joe@joe.com', 22022000002, 221000001, 221000001,null , null, null, 'open', date '2022-03-06' , date '2022-03-06');
--



CREATE TABLE CARTITEM
(
    ID 				BIGINT  not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 5202200001),
    CARTID 			BIGINT not null REFERENCES CART (ID),
    DIAGNOSTICID	BIGINT not null REFERENCES DIAGNOSTIC (ID),
--     PACKETID 		BIGINT not null REFERENCES PACKET (ID),
    RESULT			VARCHAR(20),
    UPDATED			TIMESTAMP
);

insert into CARTITEM (CARTID, DIAGNOSTICID, RESULT, UPDATED) VALUES (5202200001, 501, null, date '2022-03-04');
insert into CARTITEM (CARTID, DIAGNOSTICID, RESULT, UPDATED) VALUES (5202200001, 502, null, date '2022-03-04');
insert into CARTITEM (CARTID, DIAGNOSTICID, RESULT, UPDATED) VALUES (5202200001, 503, null, date '2022-03-04');
insert into CARTITEM (CARTID, DIAGNOSTICID, RESULT, UPDATED) VALUES (5202200001, 504, null, date '2022-03-04');
insert into CARTITEM (CARTID, DIAGNOSTICID, RESULT, UPDATED) VALUES (5202200001, 505, null, date '2022-03-04');
insert into CARTITEM (CARTID, DIAGNOSTICID, RESULT, UPDATED) VALUES (5202200001, 506, null, date '2022-03-04');

