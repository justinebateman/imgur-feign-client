package io.github.justinebateman.imgur.domain;

public class ImgurResponse<T>
{
    T data;
    Boolean success;
    Integer status;

    public T getData()
    {
        return data;
    }

    public ImgurResponse<T> setData(T data)
    {
        this.data = data;
        return this;
    }

    public Boolean getSuccess()
    {
        return success;
    }

    public ImgurResponse<T> setSuccess(Boolean success)
    {
        this.success = success;
        return this;
    }

    public Integer getStatus()
    {
        return status;
    }

    public ImgurResponse<T> setStatus(Integer status)
    {
        this.status = status;
        return this;
    }
}
