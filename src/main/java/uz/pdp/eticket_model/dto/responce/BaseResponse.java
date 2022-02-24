package uz.pdp.eticket_model.dto.responce;

public abstract class BaseResponse {
    public static ApiResponse SUCCESS = new ApiResponse("success", 0);
    public static ApiResponse SUCCESS_WITH_DATA = new ApiResponse("success", 0);


    public static ApiResponse ERROR_CAR_ALREADY_EXIST = new ApiResponse("invalid car", 404);
    public static ApiResponse ALREADY_EXIST = new ApiResponse("Alreadys exists", -1000);
    public static ApiResponse ERROR_TRAIN_ALREADY_EXIST = new ApiResponse("invalid train", 404);


    //      TODO
    public static ApiResponse ERROR_UNKNOWN = new ApiResponse("unknown", -100);

    public static ApiResponse ERROR_USER_NOT_FOUND = new ApiResponse("user not found", -101);
    public static ApiResponse NOT_FOUND = new ApiResponse("not found", -101);
    public static ApiResponse ERROR_USER_ALREADY_EXIST = new ApiResponse("user not found", -103);

    public static ApiResponse ERROR_COURSE_NOT_FOUND = new ApiResponse("course not found", -102);

}
