package com.nzion.domain.emr.lab;

import com.nzion.domain.File;
import com.nzion.domain.base.IdGeneratingBaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by Nthdimenzion on 25-Jul-16.
 */
@Entity
@Table
public class LabResultAttachments extends IdGeneratingBaseEntity {
    private static final long serialVersionUID = 1L;

    private LabOrderRequest labOrderRequest;
    private File file;
    private LabTest labTest;
    private String resultType;

    @OneToOne
    @JoinColumn(name = "Lab_Order_request_ID")
    public LabOrderRequest getLabOrderRequest() {
        return labOrderRequest;
    }

    public void setLabOrderRequest(LabOrderRequest labOrderRequest) {
        this.labOrderRequest = labOrderRequest;
    }

    @OneToOne
    @JoinColumn(name = "FILE")
    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @OneToOne
    public LabTest getLabTest() {
        return labTest;
    }

    public void setLabTest(LabTest labTest) {
        this.labTest = labTest;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
}
