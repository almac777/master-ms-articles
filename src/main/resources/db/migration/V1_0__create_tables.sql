create sequence hibernate_sequence start with 1 increment by 1;

create table article_ratings
(
    id                 bigint not null auto_increment,
    completion_rating  bigint,
    objectivity_rating bigint,
    article_id         bigint,
    user_id            bigint,
    primary key (id)
);

create table articles
(
    id  bigint not null auto_increment,
    url varchar(255),
    primary key (id)
);

-- Only one rating per user
ALTER TABLE article_ratings
    ADD CONSTRAINT unique_rating_per_article_per_user
        UNIQUE (article_id, user_id);

-- Only one URL
ALTER TABLE articles
    ADD CONSTRAINT unique_urls
        UNIQUE (url);
