INSERT INTO question(question_id,question_main,question_sub,question_type) VALUES 
  (1,'Salem RR Restaurant', 'Karapakkam', 1),
  (2,'Black Pearl', 'Shollinganallur', 2),
  (3,'Amilies', 'Thuraipakkam', 3),
  (4,'Yaa Mohideen', 'Perungudi', 1),
  (5,'FB Cake House', 'Karapakkam', 2),
  (6,'Chennai 96', 'Taramani', 3),
  (7,'Dindigul Thalapakatti', 'Thuraipakkam', 1);
  
  INSERT INTO match_question(match_question_id,question_id,match_number,match_left,match_right) VALUES
  (1,3,0,'header left','header right'),
  (2,3,1,'answer left','answer right');
  
  INSERT INTO mc_question(mc_question_id,question_id,choice_1,choice_2,choice_3,choice_4,choice_5,choice_6,choice_7) VALUES
  (1,2,'Choice1','Choice 2', 'Choice 3',null,null,null,null),
  (2,5,'Choice1','Choice 2', 'Choice 3', 'Chopice 4', 'dsvibiv',null,null);
  
  INSERT INTO answer(answer_id,question_id,option_1,option_2,option_3,option_4,answer) VALUES
  (1,1,'option a','option b','option c','option d',2),
  (2,2,'option a','option b','option c','option d',1);