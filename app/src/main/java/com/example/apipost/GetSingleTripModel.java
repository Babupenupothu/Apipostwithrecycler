package com.example.apipost;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetSingleTripModel {



    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("error")
    @Expose
    private Object error;


    @SerializedName("data")
    @Expose
    private Data data;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }



    public class Booking {

        @SerializedName("detailedPrice")
        @Expose
        private DetailedPrice detailedPrice;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("status")
        @Expose
        private Integer status;
        @SerializedName("type")
        @Expose
        private Integer type;
        @SerializedName("distance")
        @Expose
        private Integer distance;
        @SerializedName("duration")
        @Expose
        private Integer duration;
        @SerializedName("started")
        @Expose
        private Integer started;
        @SerializedName("current_timer")
        @Expose
        private Integer currentTimer;
        @SerializedName("expired")
        @Expose
        private Integer expired;
        @SerializedName("setupEnd")
        @Expose
        private Integer setupEnd;
        @SerializedName("price")
        @Expose
        private Double price;
        @SerializedName("free")
        @Expose
        private Boolean free;
        @SerializedName("createdBy")
        @Expose
        private Integer createdBy;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;
        @SerializedName("deleted_at")
        @Expose
        private Object deletedAt;
        @SerializedName("SiteId")
        @Expose
        private Integer siteId;
        @SerializedName("VehicleId")
        @Expose
        private Integer vehicleId;
        @SerializedName("UserId")
        @Expose
        private Integer userId;

        public DetailedPrice getDetailedPrice() {
            return detailedPrice;
        }

        public void setDetailedPrice(DetailedPrice detailedPrice) {
            this.detailedPrice = detailedPrice;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public Integer getDistance() {
            return distance;
        }

        public void setDistance(Integer distance) {
            this.distance = distance;
        }

        public Integer getDuration() {
            return duration;
        }

        public void setDuration(Integer duration) {
            this.duration = duration;
        }

        public Integer getStarted() {
            return started;
        }

        public void setStarted(Integer started) {
            this.started = started;
        }

        public Integer getCurrentTimer() {
            return currentTimer;
        }

        public void setCurrentTimer(Integer currentTimer) {
            this.currentTimer = currentTimer;
        }

        public Integer getExpired() {
            return expired;
        }

        public void setExpired(Integer expired) {
            this.expired = expired;
        }

        public Integer getSetupEnd() {
            return setupEnd;
        }

        public void setSetupEnd(Integer setupEnd) {
            this.setupEnd = setupEnd;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public Boolean getFree() {
            return free;
        }

        public void setFree(Boolean free) {
            this.free = free;
        }

        public Integer getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(Integer createdBy) {
            this.createdBy = createdBy;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Object getDeletedAt() {
            return deletedAt;
        }

        public void setDeletedAt(Object deletedAt) {
            this.deletedAt = deletedAt;
        }

        public Integer getSiteId() {
            return siteId;
        }

        public void setSiteId(Integer siteId) {
            this.siteId = siteId;
        }

        public Integer getVehicleId() {
            return vehicleId;
        }

        public void setVehicleId(Integer vehicleId) {
            this.vehicleId = vehicleId;
        }

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

    }

    public static  class Data {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("start")
        @Expose
        private Integer start;
        @SerializedName("end")
        @Expose
        private Integer end;
        @SerializedName("running")
        @Expose
        private Boolean running;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;
        @SerializedName("deleted_at")
        @Expose
        private Object deletedAt;
        @SerializedName("SiteId")
        @Expose
        private Integer siteId;
        @SerializedName("VehicleId")
        @Expose
        private Integer vehicleId;
        @SerializedName("StartPositionId")
        @Expose
        private Integer startPositionId;
        @SerializedName("FinishPositionId")
        @Expose
        private Integer finishPositionId;
        @SerializedName("UserId")
        @Expose
        private Integer userId;
        @SerializedName("ServiceId")
        @Expose
        private Integer serviceId;
        @SerializedName("BookingId")
        @Expose
        private Integer bookingId;
        @SerializedName("HistoryVehicleId")
        @Expose
        private Object historyVehicleId;
        @SerializedName("Booking")
        @Expose
        private Booking booking;
        @SerializedName("User")
        @Expose
        private User user;
        @SerializedName("StartPosition")
        @Expose
        private StartPosition startPosition;
        @SerializedName("FinishPosition")
        @Expose
        private FinishPosition finishPosition;
        @SerializedName("Vehicle")
        @Expose
        private Object vehicle;
        @SerializedName("StatusChanges")
        @Expose
        private List<StatusChange> statusChanges = null;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getStart() {
            return start;
        }

        public void setStart(Integer start) {
            this.start = start;
        }

        public Integer getEnd() {
            return end;
        }

        public void setEnd(Integer end) {
            this.end = end;
        }

        public Boolean getRunning() {
            return running;
        }

        public void setRunning(Boolean running) {
            this.running = running;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Object getDeletedAt() {
            return deletedAt;
        }

        public void setDeletedAt(Object deletedAt) {
            this.deletedAt = deletedAt;
        }

        public Integer getSiteId() {
            return siteId;
        }

        public void setSiteId(Integer siteId) {
            this.siteId = siteId;
        }

        public Integer getVehicleId() {
            return vehicleId;
        }

        public void setVehicleId(Integer vehicleId) {
            this.vehicleId = vehicleId;
        }

        public Integer getStartPositionId() {
            return startPositionId;
        }

        public void setStartPositionId(Integer startPositionId) {
            this.startPositionId = startPositionId;
        }

        public Integer getFinishPositionId() {
            return finishPositionId;
        }

        public void setFinishPositionId(Integer finishPositionId) {
            this.finishPositionId = finishPositionId;
        }

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public Integer getServiceId() {
            return serviceId;
        }

        public void setServiceId(Integer serviceId) {
            this.serviceId = serviceId;
        }

        public Integer getBookingId() {
            return bookingId;
        }

        public void setBookingId(Integer bookingId) {
            this.bookingId = bookingId;
        }

        public Object getHistoryVehicleId() {
            return historyVehicleId;
        }

        public void setHistoryVehicleId(Object historyVehicleId) {
            this.historyVehicleId = historyVehicleId;
        }

        public Booking getBooking() {
            return booking;
        }

        public void setBooking(Booking booking) {
            this.booking = booking;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public StartPosition getStartPosition() {
            return startPosition;
        }

        public void setStartPosition(StartPosition startPosition) {
            this.startPosition = startPosition;
        }

        public FinishPosition getFinishPosition() {
            return finishPosition;
        }

        public void setFinishPosition(FinishPosition finishPosition) {
            this.finishPosition = finishPosition;
        }

        public Object getVehicle() {
            return vehicle;
        }

        public void setVehicle(Object vehicle) {
            this.vehicle = vehicle;
        }

        public List<StatusChange> getStatusChanges() {
            return statusChanges;
        }

        public void setStatusChanges(List<StatusChange> statusChanges) {
            this.statusChanges = statusChanges;
        }

    }


    public class DetailedPrice {

        @SerializedName("running")
        @Expose
        private Double running;
        @SerializedName("parked")
        @Expose
        private Integer parked;
        @SerializedName("free")
        @Expose
        private Integer free;
        @SerializedName("prepaid")
        @Expose
        private Integer prepaid;
        @SerializedName("outOfGeoFence")
        @Expose
        private Integer outOfGeoFence;
        @SerializedName("adjustment")
        @Expose
        private Integer adjustment;
        @SerializedName("vat")
        @Expose
        private Double vat;

        public Double getRunning() {
            return running;
        }

        public void setRunning(Double running) {
            this.running = running;
        }

        public Integer getParked() {
            return parked;
        }

        public void setParked(Integer parked) {
            this.parked = parked;
        }

        public Integer getFree() {
            return free;
        }

        public void setFree(Integer free) {
            this.free = free;
        }

        public Integer getPrepaid() {
            return prepaid;
        }

        public void setPrepaid(Integer prepaid) {
            this.prepaid = prepaid;
        }

        public Integer getOutOfGeoFence() {
            return outOfGeoFence;
        }

        public void setOutOfGeoFence(Integer outOfGeoFence) {
            this.outOfGeoFence = outOfGeoFence;
        }

        public Integer getAdjustment() {
            return adjustment;
        }

        public void setAdjustment(Integer adjustment) {
            this.adjustment = adjustment;
        }

        public Double getVat() {
            return vat;
        }

        public void setVat(Double vat) {
            this.vat = vat;
        }

    }


    public class FinishPosition {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("license_plate")
        @Expose
        private String licensePlate;
        @SerializedName("longitude")
        @Expose
        private Double longitude;
        @SerializedName("latitude")
        @Expose
        private Double latitude;
        @SerializedName("fixtaken")
        @Expose
        private Integer fixtaken;
        @SerializedName("satellites")
        @Expose
        private Integer satellites;
        @SerializedName("dilution")
        @Expose
        private Double dilution;
        @SerializedName("altitude")
        @Expose
        private Double altitude;
        @SerializedName("sealevel")
        @Expose
        private Integer sealevel;
        @SerializedName("speed")
        @Expose
        private Integer speed;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("sender")
        @Expose
        private String sender;
        @SerializedName("operative_field")
        @Expose
        private Integer operativeField;
        @SerializedName("registration_date")
        @Expose
        private String registrationDate;
        @SerializedName("km")
        @Expose
        private Integer km;
        @SerializedName("isTesting")
        @Expose
        private Boolean isTesting;
        @SerializedName("brand")
        @Expose
        private String brand;
        @SerializedName("version")
        @Expose
        private String version;
        @SerializedName("model_name")
        @Expose
        private String modelName;
        @SerializedName("cylinder_capacity")
        @Expose
        private Integer cylinderCapacity;
        @SerializedName("online")
        @Expose
        private Boolean online;
        @SerializedName("HistoryVehicleId")
        @Expose
        private Integer historyVehicleId;
        @SerializedName("VehicleId")
        @Expose
        private Integer vehicleId;
        @SerializedName("inMaintenance")
        @Expose
        private Boolean inMaintenance;
        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("total_percentage")
        @Expose
        private Integer totalPercentage;
        @SerializedName("type_engine")
        @Expose
        private Integer typeEngine;
        @SerializedName("HistoryBatteryId")
        @Expose
        private Integer historyBatteryId;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;
        @SerializedName("deleted_at")
        @Expose
        private Object deletedAt;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getLicensePlate() {
            return licensePlate;
        }

        public void setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
        }

        public Double getLongitude() {
            return longitude;
        }

        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }

        public Double getLatitude() {
            return latitude;
        }

        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }

        public Integer getFixtaken() {
            return fixtaken;
        }

        public void setFixtaken(Integer fixtaken) {
            this.fixtaken = fixtaken;
        }

        public Integer getSatellites() {
            return satellites;
        }

        public void setSatellites(Integer satellites) {
            this.satellites = satellites;
        }

        public Double getDilution() {
            return dilution;
        }

        public void setDilution(Double dilution) {
            this.dilution = dilution;
        }

        public Double getAltitude() {
            return altitude;
        }

        public void setAltitude(Double altitude) {
            this.altitude = altitude;
        }

        public Integer getSealevel() {
            return sealevel;
        }

        public void setSealevel(Integer sealevel) {
            this.sealevel = sealevel;
        }

        public Integer getSpeed() {
            return speed;
        }

        public void setSpeed(Integer speed) {
            this.speed = speed;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public Integer getOperativeField() {
            return operativeField;
        }

        public void setOperativeField(Integer operativeField) {
            this.operativeField = operativeField;
        }

        public String getRegistrationDate() {
            return registrationDate;
        }

        public void setRegistrationDate(String registrationDate) {
            this.registrationDate = registrationDate;
        }

        public Integer getKm() {
            return km;
        }

        public void setKm(Integer km) {
            this.km = km;
        }

        public Boolean getIsTesting() {
            return isTesting;
        }

        public void setIsTesting(Boolean isTesting) {
            this.isTesting = isTesting;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getModelName() {
            return modelName;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        public Integer getCylinderCapacity() {
            return cylinderCapacity;
        }

        public void setCylinderCapacity(Integer cylinderCapacity) {
            this.cylinderCapacity = cylinderCapacity;
        }

        public Boolean getOnline() {
            return online;
        }

        public void setOnline(Boolean online) {
            this.online = online;
        }

        public Integer getHistoryVehicleId() {
            return historyVehicleId;
        }

        public void setHistoryVehicleId(Integer historyVehicleId) {
            this.historyVehicleId = historyVehicleId;
        }

        public Integer getVehicleId() {
            return vehicleId;
        }

        public void setVehicleId(Integer vehicleId) {
            this.vehicleId = vehicleId;
        }

        public Boolean getInMaintenance() {
            return inMaintenance;
        }

        public void setInMaintenance(Boolean inMaintenance) {
            this.inMaintenance = inMaintenance;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Integer getTotalPercentage() {
            return totalPercentage;
        }

        public void setTotalPercentage(Integer totalPercentage) {
            this.totalPercentage = totalPercentage;
        }

        public Integer getTypeEngine() {
            return typeEngine;
        }

        public void setTypeEngine(Integer typeEngine) {
            this.typeEngine = typeEngine;
        }

        public Integer getHistoryBatteryId() {
            return historyBatteryId;
        }

        public void setHistoryBatteryId(Integer historyBatteryId) {
            this.historyBatteryId = historyBatteryId;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Object getDeletedAt() {
            return deletedAt;
        }

        public void setDeletedAt(Object deletedAt) {
            this.deletedAt = deletedAt;
        }

    }




    public class StartPosition {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("license_plate")
        @Expose
        private String licensePlate;
        @SerializedName("longitude")
        @Expose
        private Double longitude;
        @SerializedName("latitude")
        @Expose
        private Double latitude;
        @SerializedName("fixtaken")
        @Expose
        private Integer fixtaken;
        @SerializedName("satellites")
        @Expose
        private Integer satellites;
        @SerializedName("dilution")
        @Expose
        private Double dilution;
        @SerializedName("altitude")
        @Expose
        private Double altitude;
        @SerializedName("sealevel")
        @Expose
        private Integer sealevel;
        @SerializedName("speed")
        @Expose
        private Double speed;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("sender")
        @Expose
        private String sender;
        @SerializedName("operative_field")
        @Expose
        private Integer operativeField;
        @SerializedName("registration_date")
        @Expose
        private String registrationDate;
        @SerializedName("km")
        @Expose
        private Integer km;
        @SerializedName("isTesting")
        @Expose
        private Boolean isTesting;
        @SerializedName("brand")
        @Expose
        private String brand;
        @SerializedName("version")
        @Expose
        private String version;
        @SerializedName("model_name")
        @Expose
        private String modelName;
        @SerializedName("cylinder_capacity")
        @Expose
        private Integer cylinderCapacity;
        @SerializedName("online")
        @Expose
        private Boolean online;
        @SerializedName("HistoryVehicleId")
        @Expose
        private Integer historyVehicleId;
        @SerializedName("VehicleId")
        @Expose
        private Integer vehicleId;
        @SerializedName("inMaintenance")
        @Expose
        private Boolean inMaintenance;
        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("total_percentage")
        @Expose
        private Integer totalPercentage;
        @SerializedName("type_engine")
        @Expose
        private Integer typeEngine;
        @SerializedName("HistoryBatteryId")
        @Expose
        private Integer historyBatteryId;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;
        @SerializedName("deleted_at")
        @Expose
        private Object deletedAt;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getLicensePlate() {
            return licensePlate;
        }

        public void setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
        }

        public Double getLongitude() {
            return longitude;
        }

        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }

        public Double getLatitude() {
            return latitude;
        }

        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }

        public Integer getFixtaken() {
            return fixtaken;
        }

        public void setFixtaken(Integer fixtaken) {
            this.fixtaken = fixtaken;
        }

        public Integer getSatellites() {
            return satellites;
        }

        public void setSatellites(Integer satellites) {
            this.satellites = satellites;
        }

        public Double getDilution() {
            return dilution;
        }

        public void setDilution(Double dilution) {
            this.dilution = dilution;
        }

        public Double getAltitude() {
            return altitude;
        }

        public void setAltitude(Double altitude) {
            this.altitude = altitude;
        }

        public Integer getSealevel() {
            return sealevel;
        }

        public void setSealevel(Integer sealevel) {
            this.sealevel = sealevel;
        }

        public Double getSpeed() {
            return speed;
        }

        public void setSpeed(Double speed) {
            this.speed = speed;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public Integer getOperativeField() {
            return operativeField;
        }

        public void setOperativeField(Integer operativeField) {
            this.operativeField = operativeField;
        }

        public String getRegistrationDate() {
            return registrationDate;
        }

        public void setRegistrationDate(String registrationDate) {
            this.registrationDate = registrationDate;
        }

        public Integer getKm() {
            return km;
        }

        public void setKm(Integer km) {
            this.km = km;
        }

        public Boolean getIsTesting() {
            return isTesting;
        }

        public void setIsTesting(Boolean isTesting) {
            this.isTesting = isTesting;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getModelName() {
            return modelName;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        public Integer getCylinderCapacity() {
            return cylinderCapacity;
        }

        public void setCylinderCapacity(Integer cylinderCapacity) {
            this.cylinderCapacity = cylinderCapacity;
        }

        public Boolean getOnline() {
            return online;
        }

        public void setOnline(Boolean online) {
            this.online = online;
        }

        public Integer getHistoryVehicleId() {
            return historyVehicleId;
        }

        public void setHistoryVehicleId(Integer historyVehicleId) {
            this.historyVehicleId = historyVehicleId;
        }

        public Integer getVehicleId() {
            return vehicleId;
        }

        public void setVehicleId(Integer vehicleId) {
            this.vehicleId = vehicleId;
        }

        public Boolean getInMaintenance() {
            return inMaintenance;
        }

        public void setInMaintenance(Boolean inMaintenance) {
            this.inMaintenance = inMaintenance;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Integer getTotalPercentage() {
            return totalPercentage;
        }

        public void setTotalPercentage(Integer totalPercentage) {
            this.totalPercentage = totalPercentage;
        }

        public Integer getTypeEngine() {
            return typeEngine;
        }

        public void setTypeEngine(Integer typeEngine) {
            this.typeEngine = typeEngine;
        }

        public Integer getHistoryBatteryId() {
            return historyBatteryId;
        }

        public void setHistoryBatteryId(Integer historyBatteryId) {
            this.historyBatteryId = historyBatteryId;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Object getDeletedAt() {
            return deletedAt;
        }

        public void setDeletedAt(Object deletedAt) {
            this.deletedAt = deletedAt;
        }

    }


    public class StatusChange {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("license_plate")
        @Expose
        private String licensePlate;
        @SerializedName("longitude")
        @Expose
        private Double longitude;
        @SerializedName("latitude")
        @Expose
        private Double latitude;
        @SerializedName("fixtaken")
        @Expose
        private Integer fixtaken;
        @SerializedName("satellites")
        @Expose
        private Integer satellites;
        @SerializedName("dilution")
        @Expose
        private Double dilution;
        @SerializedName("altitude")
        @Expose
        private Double altitude;
        @SerializedName("sealevel")
        @Expose
        private Integer sealevel;
        @SerializedName("speed")
        @Expose
        private Integer speed;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("sender")
        @Expose
        private String sender;
        @SerializedName("operative_field")
        @Expose
        private Integer operativeField;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;
        @SerializedName("deleted_at")
        @Expose
        private Object deletedAt;
        @SerializedName("VehicleId")
        @Expose
        private Integer vehicleId;
        @SerializedName("brand")
        @Expose
        private String brand;
        @SerializedName("version")
        @Expose
        private String version;
        @SerializedName("model_name")
        @Expose
        private String modelName;
        @SerializedName("cylinder_capacity")
        @Expose
        private Integer cylinderCapacity;
        @SerializedName("online")
        @Expose
        private Integer online;
        @SerializedName("isTesting")
        @Expose
        private Integer isTesting;
        @SerializedName("km")
        @Expose
        private Integer km;
        @SerializedName("registration_date")
        @Expose
        private String registrationDate;
        @SerializedName("HistoryVehicleId")
        @Expose
        private Integer historyVehicleId;
        @SerializedName("inMaintenance")
        @Expose
        private Integer inMaintenance;
        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("total_percentage")
        @Expose
        private Integer totalPercentage;
        @SerializedName("type_engine")
        @Expose
        private Integer typeEngine;
        @SerializedName("HistoryBatteryId")
        @Expose
        private Integer historyBatteryId;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getLicensePlate() {
            return licensePlate;
        }

        public void setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
        }

        public Double getLongitude() {
            return longitude;
        }

        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }

        public Double getLatitude() {
            return latitude;
        }

        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }

        public Integer getFixtaken() {
            return fixtaken;
        }

        public void setFixtaken(Integer fixtaken) {
            this.fixtaken = fixtaken;
        }

        public Integer getSatellites() {
            return satellites;
        }

        public void setSatellites(Integer satellites) {
            this.satellites = satellites;
        }

        public Double getDilution() {
            return dilution;
        }

        public void setDilution(Double dilution) {
            this.dilution = dilution;
        }

        public Double getAltitude() {
            return altitude;
        }

        public void setAltitude(Double altitude) {
            this.altitude = altitude;
        }

        public Integer getSealevel() {
            return sealevel;
        }

        public void setSealevel(Integer sealevel) {
            this.sealevel = sealevel;
        }

        public Integer getSpeed() {
            return speed;
        }

        public void setSpeed(Integer speed) {
            this.speed = speed;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public Integer getOperativeField() {
            return operativeField;
        }

        public void setOperativeField(Integer operativeField) {
            this.operativeField = operativeField;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Object getDeletedAt() {
            return deletedAt;
        }

        public void setDeletedAt(Object deletedAt) {
            this.deletedAt = deletedAt;
        }

        public Integer getVehicleId() {
            return vehicleId;
        }

        public void setVehicleId(Integer vehicleId) {
            this.vehicleId = vehicleId;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getModelName() {
            return modelName;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        public Integer getCylinderCapacity() {
            return cylinderCapacity;
        }

        public void setCylinderCapacity(Integer cylinderCapacity) {
            this.cylinderCapacity = cylinderCapacity;
        }

        public Integer getOnline() {
            return online;
        }

        public void setOnline(Integer online) {
            this.online = online;
        }

        public Integer getIsTesting() {
            return isTesting;
        }

        public void setIsTesting(Integer isTesting) {
            this.isTesting = isTesting;
        }

        public Integer getKm() {
            return km;
        }

        public void setKm(Integer km) {
            this.km = km;
        }

        public String getRegistrationDate() {
            return registrationDate;
        }

        public void setRegistrationDate(String registrationDate) {
            this.registrationDate = registrationDate;
        }

        public Integer getHistoryVehicleId() {
            return historyVehicleId;
        }

        public void setHistoryVehicleId(Integer historyVehicleId) {
            this.historyVehicleId = historyVehicleId;
        }

        public Integer getInMaintenance() {
            return inMaintenance;
        }

        public void setInMaintenance(Integer inMaintenance) {
            this.inMaintenance = inMaintenance;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Integer getTotalPercentage() {
            return totalPercentage;
        }

        public void setTotalPercentage(Integer totalPercentage) {
            this.totalPercentage = totalPercentage;
        }

        public Integer getTypeEngine() {
            return typeEngine;
        }

        public void setTypeEngine(Integer typeEngine) {
            this.typeEngine = typeEngine;
        }

        public Integer getHistoryBatteryId() {
            return historyBatteryId;
        }

        public void setHistoryBatteryId(Integer historyBatteryId) {
            this.historyBatteryId = historyBatteryId;
        }

    }

    public class User {

        @SerializedName("password")
        @Expose
        private String password;
        @SerializedName("freeMinutes")
        @Expose
        private Integer freeMinutes;
        @SerializedName("prepaidMinutes")
        @Expose
        private Integer prepaidMinutes;
        @SerializedName("validLicensePlate")
        @Expose
        private Integer validLicensePlate;
        @SerializedName("validDocument")
        @Expose
        private Integer validDocument;
        @SerializedName("status")
        @Expose
        private Integer status;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("username")
        @Expose
        private String username;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("surname")
        @Expose
        private String surname;
        @SerializedName("role")
        @Expose
        private String role;
        @SerializedName("license_id")
        @Expose
        private String licenseId;
        @SerializedName("license_expiration")
        @Expose
        private String licenseExpiration;
        @SerializedName("license_release")
        @Expose
        private String licenseRelease;
        @SerializedName("license_place")
        @Expose
        private Object licensePlace;
        @SerializedName("license_country")
        @Expose
        private String licenseCountry;
        @SerializedName("identity_type")
        @Expose
        private Object identityType;
        @SerializedName("identity_id")
        @Expose
        private String identityId;
        @SerializedName("identity_release")
        @Expose
        private String identityRelease;
        @SerializedName("identity_expiration")
        @Expose
        private String identityExpiration;
        @SerializedName("identity_issue_city")
        @Expose
        private Object identityIssueCity;
        @SerializedName("identity_issue_state")
        @Expose
        private Object identityIssueState;
        @SerializedName("cf")
        @Expose
        private String cf;
        @SerializedName("sex")
        @Expose
        private String sex;
        @SerializedName("birth")
        @Expose
        private String birth;
        @SerializedName("residence")
        @Expose
        private String residence;
        @SerializedName("cap")
        @Expose
        private String cap;
        @SerializedName("tel")
        @Expose
        private String tel;
        @SerializedName("validSMS")
        @Expose
        private Boolean validSMS;
        @SerializedName("validEmail")
        @Expose
        private Boolean validEmail;
        @SerializedName("validID")
        @Expose
        private Boolean validID;
        @SerializedName("online")
        @Expose
        private Boolean online;
        @SerializedName("authy")
        @Expose
        private Boolean authy;
        @SerializedName("authy_id")
        @Expose
        private Object authyId;
        @SerializedName("oauth")
        @Expose
        private Boolean oauth;
        @SerializedName("paymentCreated")
        @Expose
        private Boolean paymentCreated;
        @SerializedName("oauth_id")
        @Expose
        private Object oauthId;
        @SerializedName("paymentRef")
        @Expose
        private String paymentRef;
        @SerializedName("birth_country")
        @Expose
        private Object birthCountry;
        @SerializedName("birth_city")
        @Expose
        private Object birthCity;
        @SerializedName("birth_state")
        @Expose
        private Object birthState;
        @SerializedName("residence_country")
        @Expose
        private String residenceCountry;
        @SerializedName("residence_city")
        @Expose
        private String residenceCity;
        @SerializedName("residence_state")
        @Expose
        private String residenceState;
        @SerializedName("company_name")
        @Expose
        private Object companyName;
        @SerializedName("type")
        @Expose
        private Object type;
        @SerializedName("sendRegisterCompleteEmail")
        @Expose
        private Boolean sendRegisterCompleteEmail;
        @SerializedName("block")
        @Expose
        private Boolean block;
        @SerializedName("block_reason")
        @Expose
        private Object blockReason;
        @SerializedName("accessForScooter")
        @Expose
        private Boolean accessForScooter;
        @SerializedName("accessForBike")
        @Expose
        private Boolean accessForBike;
        @SerializedName("accessForCar")
        @Expose
        private Boolean accessForCar;
        @SerializedName("lastPaymentStatus")
        @Expose
        private String lastPaymentStatus;
        @SerializedName("referal")
        @Expose
        private String referal;
        @SerializedName("freeMilliseconds")
        @Expose
        private Integer freeMilliseconds;
        @SerializedName("prepaidMilliseconds")
        @Expose
        private Integer prepaidMilliseconds;
        @SerializedName("cashbackCount")
        @Expose
        private Integer cashbackCount;
        @SerializedName("createdBy")
        @Expose
        private Integer createdBy;
        @SerializedName("fbAccountKitId")
        @Expose
        private Object fbAccountKitId;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;
        @SerializedName("deleted_at")
        @Expose
        private Object deletedAt;
        @SerializedName("SiteId")
        @Expose
        private Integer siteId;
        @SerializedName("ServiceId")
        @Expose
        private Integer serviceId;

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Integer getFreeMinutes() {
            return freeMinutes;
        }

        public void setFreeMinutes(Integer freeMinutes) {
            this.freeMinutes = freeMinutes;
        }

        public Integer getPrepaidMinutes() {
            return prepaidMinutes;
        }

        public void setPrepaidMinutes(Integer prepaidMinutes) {
            this.prepaidMinutes = prepaidMinutes;
        }

        public Integer getValidLicensePlate() {
            return validLicensePlate;
        }

        public void setValidLicensePlate(Integer validLicensePlate) {
            this.validLicensePlate = validLicensePlate;
        }

        public Integer getValidDocument() {
            return validDocument;
        }

        public void setValidDocument(Integer validDocument) {
            this.validDocument = validDocument;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getLicenseId() {
            return licenseId;
        }

        public void setLicenseId(String licenseId) {
            this.licenseId = licenseId;
        }

        public String getLicenseExpiration() {
            return licenseExpiration;
        }

        public void setLicenseExpiration(String licenseExpiration) {
            this.licenseExpiration = licenseExpiration;
        }

        public String getLicenseRelease() {
            return licenseRelease;
        }

        public void setLicenseRelease(String licenseRelease) {
            this.licenseRelease = licenseRelease;
        }

        public Object getLicensePlace() {
            return licensePlace;
        }

        public void setLicensePlace(Object licensePlace) {
            this.licensePlace = licensePlace;
        }

        public String getLicenseCountry() {
            return licenseCountry;
        }

        public void setLicenseCountry(String licenseCountry) {
            this.licenseCountry = licenseCountry;
        }

        public Object getIdentityType() {
            return identityType;
        }

        public void setIdentityType(Object identityType) {
            this.identityType = identityType;
        }

        public String getIdentityId() {
            return identityId;
        }

        public void setIdentityId(String identityId) {
            this.identityId = identityId;
        }

        public String getIdentityRelease() {
            return identityRelease;
        }

        public void setIdentityRelease(String identityRelease) {
            this.identityRelease = identityRelease;
        }

        public String getIdentityExpiration() {
            return identityExpiration;
        }

        public void setIdentityExpiration(String identityExpiration) {
            this.identityExpiration = identityExpiration;
        }

        public Object getIdentityIssueCity() {
            return identityIssueCity;
        }

        public void setIdentityIssueCity(Object identityIssueCity) {
            this.identityIssueCity = identityIssueCity;
        }

        public Object getIdentityIssueState() {
            return identityIssueState;
        }

        public void setIdentityIssueState(Object identityIssueState) {
            this.identityIssueState = identityIssueState;
        }

        public String getCf() {
            return cf;
        }

        public void setCf(String cf) {
            this.cf = cf;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getBirth() {
            return birth;
        }

        public void setBirth(String birth) {
            this.birth = birth;
        }

        public String getResidence() {
            return residence;
        }

        public void setResidence(String residence) {
            this.residence = residence;
        }

        public String getCap() {
            return cap;
        }

        public void setCap(String cap) {
            this.cap = cap;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public Boolean getValidSMS() {
            return validSMS;
        }

        public void setValidSMS(Boolean validSMS) {
            this.validSMS = validSMS;
        }

        public Boolean getValidEmail() {
            return validEmail;
        }

        public void setValidEmail(Boolean validEmail) {
            this.validEmail = validEmail;
        }

        public Boolean getValidID() {
            return validID;
        }

        public void setValidID(Boolean validID) {
            this.validID = validID;
        }

        public Boolean getOnline() {
            return online;
        }

        public void setOnline(Boolean online) {
            this.online = online;
        }

        public Boolean getAuthy() {
            return authy;
        }

        public void setAuthy(Boolean authy) {
            this.authy = authy;
        }

        public Object getAuthyId() {
            return authyId;
        }

        public void setAuthyId(Object authyId) {
            this.authyId = authyId;
        }

        public Boolean getOauth() {
            return oauth;
        }

        public void setOauth(Boolean oauth) {
            this.oauth = oauth;
        }

        public Boolean getPaymentCreated() {
            return paymentCreated;
        }

        public void setPaymentCreated(Boolean paymentCreated) {
            this.paymentCreated = paymentCreated;
        }

        public Object getOauthId() {
            return oauthId;
        }

        public void setOauthId(Object oauthId) {
            this.oauthId = oauthId;
        }

        public String getPaymentRef() {
            return paymentRef;
        }

        public void setPaymentRef(String paymentRef) {
            this.paymentRef = paymentRef;
        }

        public Object getBirthCountry() {
            return birthCountry;
        }

        public void setBirthCountry(Object birthCountry) {
            this.birthCountry = birthCountry;
        }

        public Object getBirthCity() {
            return birthCity;
        }

        public void setBirthCity(Object birthCity) {
            this.birthCity = birthCity;
        }

        public Object getBirthState() {
            return birthState;
        }

        public void setBirthState(Object birthState) {
            this.birthState = birthState;
        }

        public String getResidenceCountry() {
            return residenceCountry;
        }

        public void setResidenceCountry(String residenceCountry) {
            this.residenceCountry = residenceCountry;
        }

        public String getResidenceCity() {
            return residenceCity;
        }

        public void setResidenceCity(String residenceCity) {
            this.residenceCity = residenceCity;
        }

        public String getResidenceState() {
            return residenceState;
        }

        public void setResidenceState(String residenceState) {
            this.residenceState = residenceState;
        }

        public Object getCompanyName() {
            return companyName;
        }

        public void setCompanyName(Object companyName) {
            this.companyName = companyName;
        }

        public Object getType() {
            return type;
        }

        public void setType(Object type) {
            this.type = type;
        }

        public Boolean getSendRegisterCompleteEmail() {
            return sendRegisterCompleteEmail;
        }

        public void setSendRegisterCompleteEmail(Boolean sendRegisterCompleteEmail) {
            this.sendRegisterCompleteEmail = sendRegisterCompleteEmail;
        }

        public Boolean getBlock() {
            return block;
        }

        public void setBlock(Boolean block) {
            this.block = block;
        }

        public Object getBlockReason() {
            return blockReason;
        }

        public void setBlockReason(Object blockReason) {
            this.blockReason = blockReason;
        }

        public Boolean getAccessForScooter() {
            return accessForScooter;
        }

        public void setAccessForScooter(Boolean accessForScooter) {
            this.accessForScooter = accessForScooter;
        }

        public Boolean getAccessForBike() {
            return accessForBike;
        }

        public void setAccessForBike(Boolean accessForBike) {
            this.accessForBike = accessForBike;
        }

        public Boolean getAccessForCar() {
            return accessForCar;
        }

        public void setAccessForCar(Boolean accessForCar) {
            this.accessForCar = accessForCar;
        }

        public String getLastPaymentStatus() {
            return lastPaymentStatus;
        }

        public void setLastPaymentStatus(String lastPaymentStatus) {
            this.lastPaymentStatus = lastPaymentStatus;
        }

        public String getReferal() {
            return referal;
        }

        public void setReferal(String referal) {
            this.referal = referal;
        }

        public Integer getFreeMilliseconds() {
            return freeMilliseconds;
        }

        public void setFreeMilliseconds(Integer freeMilliseconds) {
            this.freeMilliseconds = freeMilliseconds;
        }

        public Integer getPrepaidMilliseconds() {
            return prepaidMilliseconds;
        }

        public void setPrepaidMilliseconds(Integer prepaidMilliseconds) {
            this.prepaidMilliseconds = prepaidMilliseconds;
        }

        public Integer getCashbackCount() {
            return cashbackCount;
        }

        public void setCashbackCount(Integer cashbackCount) {
            this.cashbackCount = cashbackCount;
        }

        public Integer getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(Integer createdBy) {
            this.createdBy = createdBy;
        }

        public Object getFbAccountKitId() {
            return fbAccountKitId;
        }

        public void setFbAccountKitId(Object fbAccountKitId) {
            this.fbAccountKitId = fbAccountKitId;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

        public Object getDeletedAt() {
            return deletedAt;
        }

        public void setDeletedAt(Object deletedAt) {
            this.deletedAt = deletedAt;
        }

        public Integer getSiteId() {
            return siteId;
        }

        public void setSiteId(Integer siteId) {
            this.siteId = siteId;
        }

        public Integer getServiceId() {
            return serviceId;
        }

        public void setServiceId(Integer serviceId) {
            this.serviceId = serviceId;
        }

    }
}
