INSERT INTO question(question_id,question_main,question_sub,question_type) VALUES 
  (1,'The term "two-state solution" is sometimes mentioned in the news in the context of the affairs of ', '', 1),
  (2,'Consider the following statements', 'Which of the statements given is/are correct?', 2),
  (3,'Consider the following pairs', 'Which of the Pairs given are correctly matched?', 3),
  (4,'The Montahue-Chelmsford Proposals were related to', '', 1),
  (5,'"3D printing" has applications in which of the following', 'Select the correct answer using the code given below:', 2),
  (6,'Consider the following pairs', 'Which of the Pairs given are correctly matched?', 3),
  (7,'The mind of the makers of the constitution of India is reflected in which of the following?', '', 1),
  (8,'Which one of the following objective embodied in the Preamble to the *** of India', '', 1),
  (9,'Which of the following is geographically closest to Great Nicobar?', '', 1),
  (10,'Pradhan Mantri MUDRA Yojana is aimed at ', '', 1);
  
  INSERT INTO match_question(match_question_id,question_id,match_number,match_left,match_right) VALUES
  (1,3,0,'Towns sometimes mentioned in news','Country'),
  (2,3,1,'Aleppo','Syria'),
  (3,3,2,'Kirkuk','Yemen'),
  (4,3,3,'Mosul','Palestine'),
  (5,3,4,'Mazar-i-sharif','Afghanistan'),
  (6,6,0,'Famous Place','Region'),
  (7,6,1,'Bodhgaya','Baghelkhand'),
  (8,6,2,'Khajuraho','Baghelkhand'),
  (9,6,3,'Nasik','Malwa'),
  (10,6,4,'Tirupati','Rayalaseema');
  
  INSERT INTO mc_question(mc_question_id,question_id,choice_1,choice_2,choice_3,choice_4,choice_5,choice_6,choice_7) VALUES
  (1,2,'Aadhaar Card can be used as a proof of citizenship or domicile','Once issued, Aadhaar number  can not be deactivited or ommitted by Issuing Authority', null,null,null,null,null),
  (2,5,'Preparation of confectionary items','Manufacture of  bionic ears', 'Automative industry', 'Reconstructive surgeries', 'Data processing technologies',null,null);
  
  INSERT INTO answer(answer_id,question_id,option_1,option_2,option_3,option_4,answer) VALUES
  (1,1,'China','Israel','Iraq','Yemen',2),
  (2,2,'1 only','2 only','Both 1 and 2','Neither 1 nor 2',3),
  (3,3,'1 and 2','1 and 4','2 and 3','3 and 4',1),
  (4,4,'Social reforms','Educational reforms','Reforms in police administration','Constitutional reforms',1),
  (5,5,'1, 3 and 4 only','2, 3 and 5 only','1 and 4 only','1, 2, 3, 4 and 5',4),
  (6,6,'1, 2 and 4','2, 3, 4 and 5','2 and 5 only','1, 3, 4 and 5',1),
  (7,7,'The Preamble','The Fundamental Rights','The Directive Principlesof State Policy','The Fudamental Duties ',3),
  (8,8,'Liberty of thought','Economic liberty','Liberty of expression','Liberty of belief',2),
  (9,9,'Sumatra','Borneo','Java','Sri Lanka',4),
  (10,10,'Bringing the small entrepreneurs into formal financial system','Providing loans to poor farmers for cultivating particular crops','Providing pensions to old and destitutes','Funding the voluntary organizations involved in promation of skill development and employment generation',1);