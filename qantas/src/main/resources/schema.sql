
/* create airline table */
DROP TABLE IF EXISTS airline;  
CREATE TABLE IF NOT EXISTS airline
(
    id uuid NOT NULL,
    code character varying(5),
    name character varying(250),
    CONSTRAINT airline_pkey PRIMARY KEY (id)
);

/* create location table */
DROP TABLE IF EXISTS location;
CREATE TABLE IF NOT EXISTS location
(
    id uuid NOT NULL,
    code character varying(5),
    name character varying(250),
    CONSTRAINT location_pkey PRIMARY KEY (id)
);

/* create flight_schedule table */
DROP TABLE IF EXISTS flight_schedule;
CREATE TABLE IF NOT EXISTS flight_schedule
(
    id uuid NOT NULL,
    arrival_time timestamp without time zone,
    departure_time timestamp without time zone,
    flight_code character varying(5),
    airline_id uuid NOT NULL,
    arrival_location_id uuid NOT NULL,
    departure_location_id uuid NOT NULL,
    CONSTRAINT flight_schedule_pkey PRIMARY KEY (id),
    CONSTRAINT uk_flight_code UNIQUE (flight_code),
    CONSTRAINT fk_departure_lolcation_id FOREIGN KEY (departure_location_id)
        REFERENCES location (id),
    CONSTRAINT fk_airline_id FOREIGN KEY (airline_id)
        REFERENCES airline (id),
    CONSTRAINT fk_arrival_location_id FOREIGN KEY (arrival_location_id)
        REFERENCES location (id)
);

