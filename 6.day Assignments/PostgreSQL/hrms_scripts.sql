CREATE TABLE "public"."users"( 
	"id" int NOT NULL PRIMARY KEY,
	"email" VARCHAR(50) NOT NULL,
	UNIQUE (email),
	"password" VARCHAR(50) NOT NULL);
	
CREATE TABLE "public"."employers"(
	"user_id" int NOT NULL PRIMARY KEY REFERENCES users (id),
	"sirket_adi" VARCHAR(100) NOT NULL,
	UNIQUE (sirket_adi),
	"sirket_website" VARCHAR(100) NOT NULL,
	UNIQUE (sirket_website),
	"telefon_no" VARCHAR(13) NOT NULL,
	UNIQUE (telefon_no) );

CREATE TABLE "public"."job_seekers"(
	"user_id" int NOT NULL PRIMARY KEY REFERENCES users (id),
	"ad" VARCHAR(50) NOT NULL,
	"soyad" VARCHAR(50) NOT NULL,
	"tc_no" VARCHAR(11) NOT NULL,
	"birth_year" int NOT NULL);
	
ALTER TABLE "public"."job_seekers"
	ADD CONSTRAINT "uc_job_seekers_tc_no"
	UNIQUE (tc_no);
	
CREATE TABLE "public"."employees"(
	"user_id" int NOT NULL PRIMARY KEY REFERENCES users (id));
	
CREATE TABLE "public"."verifications_from_hrms"(
	"id" int NOT NULL PRIMARY KEY,
	"user_id" int NOT NULL REFERENCES users (id),
	"verification" boolean NOT NULL);

CREATE TABLE "public"."email_verifications"(
	"id" int NOT NULL PRIMARY KEY,
	"user_id" int NOT NULL,
	"verification" boolean NOT NULL);
	
ALTER TABLE "public"."email_verifications"
	ADD CONSTRAINT "uc_email_verifications_user_id" UNIQUE ("user_id");
	
ALTER TABLE "public"."email_verifications"
	ADD CONSTRAINT "fk_email_verifications_user_id"
	FOREIGN KEY ("user_id")
	REFERENCES "public"."users" ("id");
	
CREATE TABLE "public"."mernis_verifications"(
	"id" int NOT NULL PRIMARY KEY,
	"user_id" int NOT NULL,
	"verification" boolean NOT NULL);
	
ALTER TABLE "public"."mernis_verifications"
	ADD CONSTRAINT "uc_mernis_verifications_user_id" UNIQUE ("user_id");

ALTER TABLE "public"."mernis_verifications"
	ADD CONSTRAINT "fk_mernis_verifications_user_id"
	FOREIGN KEY ("user_id")
	REFERENCES "public"."users" ("id");
	
CREATE TABLE "public"."job_positions"(
	"id" int NOT NULL PRIMARY KEY,
	"job_explanation" VARCHAR(250) NOT NULL);
	
	
CREATE SEQUENCE "public"."users_id_seq"
	INCREMENT BY 1 START WITH 1 OWNED BY "public"."users"."id";

CREATE SEQUENCE "public"."verifications_from_hrms_id_seq"
	INCREMENT BY 1 START WITH 1 OWNED BY "public"."verifications_from_hrms"."id";

CREATE SEQUENCE "public"."email_verifications_id_seq"
	INCREMENT BY 1 START WITH 1 OWNED BY "public"."email_verifications"."id";

CREATE SEQUENCE "public"."mernis_verifications_id_seq"
	INCREMENT BY 1 START WITH 1 OWNED BY "public"."mernis_verifications"."id";

CREATE SEQUENCE "public"."job_positions_id_seq"
	INCREMENT BY 1 START WITH 1 OWNED BY "public"."job_positions"."id";
	
