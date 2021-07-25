-- user2로 my_board databse에 재접속

-- 게시판 테이블 생성
CREATE TABLE IF NOT EXISTS `my_board`.`myb_board` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '게시글이 생성되면 할당될 고유 아이디 키. 이 키를 이용하여 게시글 RUD 수행.',
  `is_del` VARCHAR(1) NULL DEFAULT 'N' COMMENT '삭제 여부\nY 삭제됨\nN 정상',
  `reg_user` VARCHAR(45) NOT NULL COMMENT '작성자 아이디',
  `subject` VARCHAR(255) NOT NULL COMMENT '글 제목',
  `hits` INT NOT NULL COMMENT '글 조회수',
  `reg_dt` DATETIME NULL COMMENT '작성 일시',
  `edit_dt` DATETIME NULL COMMENT '수정 일시',
  `content` MEDIUMTEXT NULL COMMENT '글 내용',
  PRIMARY KEY (`id`),
  INDEX `IDX_MYB_BOARD_1` (`reg_user` ASC, `id` ASC) COMMENT '지정한 사용자의 글을 생성한 순서로 정렬하도록 함.' VISIBLE)
ENGINE = InnoDB
COMMENT = '게시판 관리';