create schema teste;

use teste;

CREATE USER 'toni'@'localhost' IDENTIFIED BY '1234';

GRANT ALL PRIVILEGES ON * . * TO 'toni'@'localhost';

create table usr_usuario (
  usr_id bigint unsigned not null auto_increment,
  usr_nome varchar(20) not null,
  usr_senha varchar(20) not null,
  primary key (usr_id),
  unique key uk_usuario_nome (usr_nome)
);

create table f_filme (
  f_id bigint unsigned not null auto_increment,
  f_nome varchar(20) not null,
  f_genero varchar(20) not null,
  f_anolancamento varchar(4) not null,  
  primary key (filme_id),
  unique key uni_filme_nome (filme_nome)
);

create table coment_comentario (
  coment_id bigint unsigned not null auto_increment,
  usr_id bigint unsigned not null,
  f_id bigint unsigned not null,
  comentario varchar(80) not null,
  primary key (comentario_id),
  foreign key aut_usuario_fk (usr_id) references usuario (usr_id) on delete restrict on update cascade,
  foreign key aut_filme_fk (f_id) references filme (f_id) on delete restrict on update cascade
);

INSERT INTO usr_usuario VALUES
("Toni", "t123"),
("William", "w123"),
("Prado", "p123");

INSERT INTO f_filme VALUES
("Os Vingadores", "Ação", "2012"),
("Vingadores: Era de Ultron", "Ação" ,"2015"),
("Vingadores: Guerra Infinita", "Ação", "2018"),
("Vingadores Ultimato", "Ação", "2019");

INSERT INTO coment_comnetario VALUES
(1,1, "Um filme espetacular, que muita gente gostou."),
(2,1, "ação,aventura,diversão e emoção."),
(1,2, "Mantém a ótima qualidade do filme anterior e traz muita ação e uma dose altíssima de bons efeitos."),
(3,2, "Filme muito bom"),
(3,3, "Adrenalina e surpresa do primeiro ao último minuto."),
(2,3, "que filme amigos, que edição, quanta morte de protagonista, quanta história. um dos melhores filmes de heróis se nao o melhor"),
(1,4, "A espera de 10 anos valeu sim à pena. Filme fez jus a um encerramento de uma saga."),
(2,4, "Melhor filme!Muito legal, engraçado, tem aventura, ação, emoção não parece que passam 3 horas.")
(3,4, "Finalmente, uma conclusão é desfecho de tudo que andávamos vendo nos últimos 10 anos.")
