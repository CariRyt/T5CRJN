create database electionmachine;
use electionmachine;
ALTER DATABASE electionmachine CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
create user team5@localhost identified by 'huhuu';
grant all on electionmachine.* to team5@localhost;
CREATE TABLE KYSYMYKSET (
   KYSYMYS_ID INTEGER NOT NULL auto_increment,
   KYSYMYS VARCHAR(100),
   PRIMARY KEY (KYSYMYS_ID)
);
INSERT INTO KYSYMYKSET VALUES (1, "Suomessa on liian helppo elää sosiaaliturvan varassa");
INSERT INTO KYSYMYKSET VALUES (2, "Kaupan ja muiden liikkeiden aukioloajat on vapautettava.");
INSERT INTO KYSYMYKSET VALUES (3, "Suomessa on siirryttävä perustuloon joka korvaisi nykyisen sosiaaliturvan vähimmäistason.");
INSERT INTO KYSYMYKSET VALUES (4, "Tyäntekijälle on turvattava lailla minimityäaika.");
INSERT INTO KYSYMYKSET VALUES (5, "Ansiosidonnaisen tyättämyysturvan kestoa pitää lyhentää.");
INSERT INTO KYSYMYKSET VALUES (6, "Euron ulkopuolella Suomi pärjäisi paremmin.");
INSERT INTO KYSYMYKSET VALUES (7, "Ruoan verotusta on varaa kiristää.");
INSERT INTO KYSYMYKSET VALUES (8, "Valtion ja kuntien taloutta on tasapainotettava ensisijaisesti leikkaamalla menoja.");
INSERT INTO KYSYMYKSET VALUES (9, "Lapsilisiä on korotettava ja laitettava verolle.");
INSERT INTO KYSYMYKSET VALUES (10, "Suomella ei ole varaa nykyisen laajuisiin sosiaali- ja terveyspalveluihin.");
INSERT INTO KYSYMYKSET VALUES (11, "Nato-jäsenyys vahvistaisi Suomen turvallisuuspoliittista asemaa.");
INSERT INTO KYSYMYKSET VALUES (12, "Suomeen tarvitaan enemmän poliiseja.");
INSERT INTO KYSYMYKSET VALUES (13, "Maahanmuuttoa Suomeen on rajoitettava terrorismin uhan vuoksi.");
INSERT INTO KYSYMYKSET VALUES (14, "Venäjän etupiiripolitiikka on uhka Suomelle.");
INSERT INTO KYSYMYKSET VALUES (15, "Verkkovalvonnassa valtion turvallisuus on tärkeämpää kuin kansalaisten yksityisyyden suoja.");
INSERT INTO KYSYMYKSET VALUES (16, "Suomen on osallistuttava Isisin vastaiseen taisteluun kouluttamalla Irakin hallituksen joukkoja.");
INSERT INTO KYSYMYKSET VALUES (17, "Parantumattomasti sairaalla on oltava oikeus avustettuun kuolemaan.");
INSERT INTO KYSYMYKSET VALUES (18, "Terveys- ja sosiaalipalvelut on tuotettava ensijaisesti julkisina palveluina.");
INSERT INTO KYSYMYKSET VALUES (19, "Viranomaisten pitää puuttua lapsiperheiden ongelmiin nykyistä herkemmin.");