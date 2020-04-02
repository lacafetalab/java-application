CREATE TABLE IF NOT EXISTS public.courses
(
    id character(36) NOT NULL,
    name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    duration character varying(100) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT courses_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.courses
    OWNER to postgres;
