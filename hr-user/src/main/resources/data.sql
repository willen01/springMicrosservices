INSERT INTO tb_user (name, email, password) VALUES ('Nina Brown', 'nina@gmail.com', '$2a$10$m5yNzJZ.O7WZJA2ndx9Ez.dvbmIzf1/EGt.hSgrgc9klcHZnLUo8m');
INSERT INTO tb_user (name, email, password) VALUES ('Leia Red', 'leia@gmail.com', '$2a$10$m5yNzJZ.O7WZJA2ndx9Ez.dvbmIzf1/EGt.hSgrgc9klcHZnLUo8m');

-- snack case default in jpa
INSERT INTO tb_role (role_name) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (role_name) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);