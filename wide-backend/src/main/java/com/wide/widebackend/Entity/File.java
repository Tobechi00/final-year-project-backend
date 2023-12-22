package com.wide.widebackend.Entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

@Entity
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Nonnull
    String fileName;

    @Column
    @Nonnull
    byte[] fileContent;

    @Column
    @Nonnull
    String fileType;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User userRef;

    public File(){}

    public File(@Nonnull String fileName, @Nonnull byte[] fileContent, @Nonnull String fileType) {
        this.fileName = fileName;
        this.fileContent = fileContent;
        this.fileType = fileType;
    }

    @Nonnull
    public String getFileName() {
        return fileName;
    }

    public void setFileName(@Nonnull String fileName) {
        this.fileName = fileName;
    }

    @Nonnull
    public byte[] getFileContent() {
        return fileContent;
    }

    public void setFileContent(@Nonnull byte[] fileContent) {
        this.fileContent = fileContent;
    }

    @Nonnull
    public String getFileType() {
        return fileType;
    }

    public User getUserRef() {
        return userRef;
    }

    public void setUserRef(User userRef) {
        this.userRef = userRef;
    }

    public void setFileType(@Nonnull String fileType) {
        this.fileType = fileType;
    }
}
