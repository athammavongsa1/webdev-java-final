drop table who_to_follow;
CREATE TABLE who_to_follow (
       who_id int NOT NULL AUTO_INCREMENT,
       username varchar(255) DEFAULT NULL,
       avatar_icon varchar(255) DEFAULT NULL,
       handle varchar(255) DEFAULT NULL,
       PRIMARY KEY (who_id)
);


INSERT INTO `Tuitter`.`who_to_follow`
(`who_id`, `username`, `handle`,`avatar_icon`  )  values (null, 'Java', 'java', '/imgs/java.png');

INSERT INTO `Tuitter`.`who_to_follow`
(`who_id`, `username`, `handle`,`avatar_icon`  )  values (null, 'Relaivity Space', 'Relativity Space', '/imgs/relativity-space.jpg');

INSERT INTO `Tuitter`.`who_to_follow`
(`who_id`, `username`, `handle`,`avatar_icon`  )  values (null, 'Virgin Galactic', 'Virgin', '/imgs/virgin.png');

INSERT INTO `Tuitter`.`who_to_follow`
(`who_id`, `username`, `handle`,`avatar_icon`  )  values (null, 'NASA', 'NASA', '/imgs/nasa.png');

INSERT INTO `Tuitter`.`who_to_follow`
(`who_id`, `username`, `handle`,`avatar_icon`  )  values (null, 'Tesla', 'TSLA', '/imgs/tesla.png');

select * from Tuitter.who_to_follow;

SELECT * FROM Tuitter.users;

insert into Tuitter.users values (null, '/public/imgs/banner.jpg','Factulty, Software Engineer', '4/2009', '1996-02-16','Jose', '312', '180','Annunziato','Houston,Texas', '/imgs/jose.png','jannunzi','google.com');
insert into Tuitter.users values (null, '/public/imgs/banner.jpg','Fidelity Software Engineer', '4/2009', '1996-02-16','Alex', '312', '180','Thammavongsa','Houston,Texas', '/imgs/jose.png','jannunzi','fidelity.com');



