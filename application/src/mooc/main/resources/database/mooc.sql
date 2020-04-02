CREATE TABLE IF NOT EXISTS public.courses
(
    id character(36) NOT NULL,
    name character varying(101) COLLATE pg_catalog."default" NOT NULL,
    duration character varying(101) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT courses_pk PRIMARY KEY (id)
)
    WITH (
        OIDS = FALSE
    )
    TABLESPACE pg_default;
ALTER TABLE public.courses
    OWNER to postgres;


CREATE TABLE IF NOT EXISTS public.courses_counter
(
    id character(36) NOT NULL,
    total integer NOT NULL,
    existing_courses json NOT NULL,
    CONSTRAINT courses_counter_pk PRIMARY KEY (id)
)
    WITH (
        OIDS = FALSE
    )
    TABLESPACE pg_default;
ALTER TABLE public.courses_counter
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS public.domain_events
(
    id character(36) NOT NULL,
    aggregate_id character varying(36) COLLATE pg_catalog."default" NOT NULL,
    name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    body json NOT NULL,
    occurred_on timestamp without time zone NOT NULL,
    CONSTRAINT domain_events_pk PRIMARY KEY (id)
)
    WITH (
        OIDS = FALSE
    )
    TABLESPACE pg_default;
ALTER TABLE public.domain_events
    OWNER to postgres;


CREATE TABLE IF NOT EXISTS public.steps
(
    id character(36) NOT NULL,
    title character varying(150) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT steps_pk PRIMARY KEY (id)
)
    WITH (
        OIDS = FALSE
    )
    TABLESPACE pg_default;
ALTER TABLE public.steps
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS public.steps_challenges
(
    id character(36) NOT NULL,
    statement text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT steps_challenges_pk PRIMARY KEY (id),
    CONSTRAINT steps_challenges_steps_id_fk FOREIGN KEY (id)
        REFERENCES public.steps (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
    WITH (
        OIDS = FALSE
    )
    TABLESPACE pg_default;

ALTER TABLE public.steps_challenges
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS public.steps_videos
(
    id character(36) NOT NULL,
    url character varying(100) COLLATE pg_catalog."default" NOT NULL,
    text text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT steps_videos_pk PRIMARY KEY (id),
    CONSTRAINT steps_videos_steps_id_fk FOREIGN KEY (id)
        REFERENCES public.steps (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
    WITH (
        OIDS = FALSE
    )
    TABLESPACE pg_default;

ALTER TABLE public.steps_videos
    OWNER to postgres;
