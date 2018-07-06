package io.github.justinebateman.imgur.domain;

import java.util.Date;
import java.util.List;

public class ImgurImageResponse
{
    String id;
    String title;
    String description;
    Date datetime;
    String type;
    Boolean animated;
    Integer width;
    Integer height;
    Integer size;
    Integer views;
    Integer bandwidth;
    String vote;
    Boolean favorite;
    String nsfw;
    String section;
    String account_url;
    Integer account_id;
    Boolean is_ad;
    Boolean in_most_viral;
    List<String> tags;
    String ad_type;
    String ad_url;
    Boolean in_gallery;
    String deletehash;
    String name;
    String link;

    public ImgurImageResponse()
    {
    }

    public String getId()
    {
        return id;
    }

    public ImgurImageResponse setId(String id)
    {
        this.id = id;
        return this;
    }

    public String getTitle()
    {
        return title;
    }

    public ImgurImageResponse setTitle(String title)
    {
        this.title = title;
        return this;
    }

    public String getDescription()
    {
        return description;
    }

    public ImgurImageResponse setDescription(String description)
    {
        this.description = description;
        return this;
    }

    public Date getDatetime()
    {
        return datetime;
    }

    public ImgurImageResponse setDatetime(Date datetime)
    {
        this.datetime = datetime;
        return this;
    }

    public String getType()
    {
        return type;
    }

    public ImgurImageResponse setType(String type)
    {
        this.type = type;
        return this;
    }

    public Boolean getAnimated()
    {
        return animated;
    }

    public ImgurImageResponse setAnimated(Boolean animated)
    {
        this.animated = animated;
        return this;
    }

    public Integer getWidth()
    {
        return width;
    }

    public ImgurImageResponse setWidth(Integer width)
    {
        this.width = width;
        return this;
    }

    public Integer getHeight()
    {
        return height;
    }

    public ImgurImageResponse setHeight(Integer height)
    {
        this.height = height;
        return this;
    }

    public Integer getSize()
    {
        return size;
    }

    public ImgurImageResponse setSize(Integer size)
    {
        this.size = size;
        return this;
    }

    public Integer getViews()
    {
        return views;
    }

    public ImgurImageResponse setViews(Integer views)
    {
        this.views = views;
        return this;
    }

    public Integer getBandwidth()
    {
        return bandwidth;
    }

    public ImgurImageResponse setBandwidth(Integer bandwidth)
    {
        this.bandwidth = bandwidth;
        return this;
    }

    public String getVote()
    {
        return vote;
    }

    public ImgurImageResponse setVote(String vote)
    {
        this.vote = vote;
        return this;
    }

    public Boolean getFavorite()
    {
        return favorite;
    }

    public ImgurImageResponse setFavorite(Boolean favorite)
    {
        this.favorite = favorite;
        return this;
    }

    public String getNsfw()
    {
        return nsfw;
    }

    public ImgurImageResponse setNsfw(String nsfw)
    {
        this.nsfw = nsfw;
        return this;
    }

    public String getSection()
    {
        return section;
    }

    public ImgurImageResponse setSection(String section)
    {
        this.section = section;
        return this;
    }

    public String getAccount_url()
    {
        return account_url;
    }

    public ImgurImageResponse setAccount_url(String account_url)
    {
        this.account_url = account_url;
        return this;
    }

    public Integer getAccount_id()
    {
        return account_id;
    }

    public ImgurImageResponse setAccount_id(Integer account_id)
    {
        this.account_id = account_id;
        return this;
    }

    public Boolean getIs_ad()
    {
        return is_ad;
    }

    public ImgurImageResponse setIs_ad(Boolean is_ad)
    {
        this.is_ad = is_ad;
        return this;
    }

    public Boolean getIn_most_viral()
    {
        return in_most_viral;
    }

    public ImgurImageResponse setIn_most_viral(Boolean in_most_viral)
    {
        this.in_most_viral = in_most_viral;
        return this;
    }

    public List<String> getTags()
    {
        return tags;
    }

    public ImgurImageResponse setTags(List<String> tags)
    {
        this.tags = tags;
        return this;
    }

    public String getAd_type()
    {
        return ad_type;
    }

    public ImgurImageResponse setAd_type(String ad_type)
    {
        this.ad_type = ad_type;
        return this;
    }

    public String getAd_url()
    {
        return ad_url;
    }

    public ImgurImageResponse setAd_url(String ad_url)
    {
        this.ad_url = ad_url;
        return this;
    }

    public Boolean getIn_gallery()
    {
        return in_gallery;
    }

    public ImgurImageResponse setIn_gallery(Boolean in_gallery)
    {
        this.in_gallery = in_gallery;
        return this;
    }

    public String getDeletehash()
    {
        return deletehash;
    }

    public ImgurImageResponse setDeletehash(String deletehash)
    {
        this.deletehash = deletehash;
        return this;
    }

    public String getName()
    {
        return name;
    }

    public ImgurImageResponse setName(String name)
    {
        this.name = name;
        return this;
    }

    public String getLink()
    {
        return link;
    }

    public ImgurImageResponse setLink(String link)
    {
        this.link = link;
        return this;
    }
}
