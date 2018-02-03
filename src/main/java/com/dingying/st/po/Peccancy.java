package com.dingying.st.po;

import java.util.Date;

public class Peccancy {
    private Long id;

    //车辆ID
    private String carId;

    //车牌号码
    private String plateNumber;

    //违章类型（外键）
    private Integer peccancyType;

    //描述
    private String description;

    //扣分
    private Byte deductMarks;

    //罚款金额
    private Integer fine;

    //处理状态 0-未处理，1-已处理
    private Boolean treatmentStatus;

    //违章地点
    private String site;

    //违章时间
    private Date peccancyTime;

    //抓拍相片
    private String photo;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取车辆ID
     *
     * @return car_id - 车辆ID
     */
    public String getCarId() {
        return carId;
    }

    /**
     * 设置车辆ID
     *
     * @param carId 车辆ID
     */
    public void setCarId(String carId) {
        this.carId = carId;
    }

    /**
     * 获取车牌号码
     *
     * @return plate_number - 车牌号码
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * 设置车牌号码
     *
     * @param plateNumber 车牌号码
     */
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    /**
     * 获取违章类型（外键）
     *
     * @return peccancy_type - 违章类型（外键）
     */
    public Integer getPeccancyType() {
        return peccancyType;
    }

    /**
     * 设置违章类型（外键）
     *
     * @param peccancyType 违章类型（外键）
     */
    public void setPeccancyType(Integer peccancyType) {
        this.peccancyType = peccancyType;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取扣分
     *
     * @return deduct_marks - 扣分
     */
    public Byte getDeductMarks() {
        return deductMarks;
    }

    /**
     * 设置扣分
     *
     * @param deductMarks 扣分
     */
    public void setDeductMarks(Byte deductMarks) {
        this.deductMarks = deductMarks;
    }

    /**
     * 获取罚款金额
     *
     * @return fine - 罚款金额
     */
    public Integer getFine() {
        return fine;
    }

    /**
     * 设置罚款金额
     *
     * @param fine 罚款金额
     */
    public void setFine(Integer fine) {
        this.fine = fine;
    }

    /**
     * 获取处理状态 0-未处理，1-已处理
     *
     * @return treatment_status - 处理状态 0-未处理，1-已处理
     */
    public Boolean getTreatmentStatus() {
        return treatmentStatus;
    }

    /**
     * 设置处理状态 0-未处理，1-已处理
     *
     * @param treatmentStatus 处理状态 0-未处理，1-已处理
     */
    public void setTreatmentStatus(Boolean treatmentStatus) {
        this.treatmentStatus = treatmentStatus;
    }

    /**
     * 获取违章地点
     *
     * @return site - 违章地点
     */
    public String getSite() {
        return site;
    }

    /**
     * 设置违章地点
     *
     * @param site 违章地点
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * 获取违章时间
     *
     * @return peccancy_time - 违章时间
     */
    public Date getPeccancyTime() {
        return peccancyTime;
    }

    /**
     * 设置违章时间
     *
     * @param peccancyTime 违章时间
     */
    public void setPeccancyTime(Date peccancyTime) {
        this.peccancyTime = peccancyTime;
    }

    /**
     * 获取抓拍相片
     *
     * @return photo - 抓拍相片
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * 设置抓拍相片
     *
     * @param photo 抓拍相片
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }
}