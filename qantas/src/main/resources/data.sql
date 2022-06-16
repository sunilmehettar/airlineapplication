
/* insert sample airline data */
INSERT INTO airline VALUES 
	('0f0fd70e-bd01-4360-a8e1-5cdc7cbef8df', 'EK', 'Emirates'),
	('935b5bec-fd13-40f7-b290-cd55871560fd', 'QF', 'Qantas'),
	('e150f2a4-725c-4640-8a3f-bfae156ab0aa', 'CX', 'Cathay Pacific'), 
	('776074c6-1c9d-49f4-a35c-82738ae8f4fa', 'AF', 'Air France'),
	('12dfe22b-8588-4785-b92a-7902287e247f', 'AV', 'Air Vanuatu'),
	('216f7a7c-ff64-4b4a-a025-1d387f2febcb', 'EM', 'Emirates'),
	('a4a0625c-cbe5-4fff-a96f-47453da0a695', 'WJ', 'WestJet'),
	('2ad4aac3-292f-4a65-965e-32ab2c27940c', 'AA', 'Asiana Airlines');  
	

/* insert sample location data */	
INSERT INTO location VALUES
	('70b0aa28-e14d-478e-8782-263b05a21f9a', 'LAS', 'Los Angeles'),
	('276cce32-f7ec-491e-a300-8fa84fb63b26', 'SYD', 'Sydney'),
	('6c07b24c-eb2b-495c-8539-b0915ef59a8e', 'MEL', 'Melbourne'),
	('fc0512a6-cb8b-4dd4-876b-ca9a325d2298', 'BRI', 'Brisbane'),
	('cdf33c70-1a1d-43c6-ba68-5de3749ca1eb', 'DFW', 'Dallas Fort Worth'),
	('55850578-a3db-4c8f-8e29-5560ff2d8d62', 'SAF', 'San Francisco'),
	('dc281507-da10-415d-9b7e-146182b510e2', 'HON', 'Honolulu');
	
/* insert few flight schedules */	
INSERT INTO flight_schedule (id,flight_code,airline_id,departure_location_id,arrival_location_id,departure_time, arrival_time) 
VALUES
('fc2cd0ba-4bd5-4220-854c-6525063b9ba6', '010', '935b5bec-fd13-40f7-b290-cd55871560fd', '70b0aa28-e14d-478e-8782-263b05a21f9a', '276cce32-f7ec-491e-a300-8fa84fb63b26', CURRENT_TIMESTAMP,  DATEADD('HOUR',3, CURRENT_TIMESTAMP)),
('482cff9f-665d-4a79-ba66-5adaaf252dd6', '130', '2ad4aac3-292f-4a65-965e-32ab2c27940c', 'dc281507-da10-415d-9b7e-146182b510e2', 'fc0512a6-cb8b-4dd4-876b-ca9a325d2298', DATEADD('HOUR',-10, CURRENT_TIMESTAMP),  DATEADD('HOUR',3, CURRENT_TIMESTAMP)),
('d0e1115d-f1ae-4088-85f3-a818f0cceb90', '412', '12dfe22b-8588-4785-b92a-7902287e247f', '6c07b24c-eb2b-495c-8539-b0915ef59a8e', 'cdf33c70-1a1d-43c6-ba68-5de3749ca1eb', CURRENT_TIMESTAMP,  DATEADD('DAY',1, CURRENT_TIMESTAMP)),
('22cfdb06-eaf1-4e21-86d6-420f1cc5f0c1', '818', '2ad4aac3-292f-4a65-965e-32ab2c27940c', '276cce32-f7ec-491e-a300-8fa84fb63b26', 'cdf33c70-1a1d-43c6-ba68-5de3749ca1eb', DATEADD('DAY',-1, CURRENT_TIMESTAMP),  CURRENT_TIMESTAMP),
('76a9be9e-08c8-4d1b-8765-22310c1e6d69', '543', 'e150f2a4-725c-4640-8a3f-bfae156ab0aa', '276cce32-f7ec-491e-a300-8fa84fb63b26', 'cdf33c70-1a1d-43c6-ba68-5de3749ca1eb', DATEADD('HOUR',-4, CURRENT_TIMESTAMP),  DATEADD('HOUR',3, CURRENT_TIMESTAMP));	