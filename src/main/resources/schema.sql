CREATE TABLE IF NOT EXISTS photos (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    file_name VARCHAR(255),
    content_type VARCHAR(255),
    data BLOB
);
