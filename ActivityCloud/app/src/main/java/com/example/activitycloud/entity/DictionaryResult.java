package com.example.activitycloud.entity;


import java.util.List;

public class DictionaryResult {
    private String message;
    private boolean success;
    private List<DictionaryBean> data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<DictionaryBean> getData() {
        return data;
    }

    public void setData(List<DictionaryBean> data) {
        this.data = data;
    }

    public static class DictionaryBean {
        private String id;
        private String dictionaryCode;
        private String dictionaryName;
        private String parentCode;
        private String description;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDictionaryCode() {
            return dictionaryCode;
        }

        public void setDictionaryCode(String dictionaryCode) {
            this.dictionaryCode = dictionaryCode;
        }

        public String getDictionaryName() {
            return dictionaryName;
        }

        public void setDictionaryName(String dictionaryName) {
            this.dictionaryName = dictionaryName;
        }

        public String getParentCode() {
            return parentCode;
        }

        public void setParentCode(String parentCode) {
            this.parentCode = parentCode;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

}
