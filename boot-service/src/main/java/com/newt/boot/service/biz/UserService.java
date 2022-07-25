package com.newt.boot.service.biz;



import com.newt.boot.common.response.MchntBaseInfoDto;
import com.newt.boot.common.response.MchntUserInfoResponse;
import com.newt.boot.service.dto.UserDto;

import java.util.List;

public interface UserService {

    /**
     * 跟新登录信息并生成新的token
     *
     * @param login
     * @param deviceId
     * @return
     */
    String generateJwtToken(String login, String deviceId);

    /**
     * 从token中获取用户信息
     *
     * @param login
     * @return
     */
    UserDto getJwtTokenInfo(String login);

    /**
     * 根据登录名获取用户信息
     *
     * @param login
     * @return
     */
    UserDto getUserInfoByLogin(String login);

    /**
     * 根据userId获取用户信息
     * @param userId
     * @return
     */
    MchntUserInfoResponse getCurrentUserInfo(UserDto user, String mchntNo);
     MchntUserInfoResponse getUserInfoCurrent(String userId);

    /**
     * 删除登录信息
     *
     * @param login
     */
    void deleteLoginInfo(String login);

    /**
     * 生成秘钥对
     * @param deviceId
     * @param srcPubKey
     * @return
     */
    String generateKeyPair(String deviceId, String srcPubKey);

    /**
     * 更新密码
     * @param userId
     * @param oldPwd
     * @param newPwd
     * @return
     */
    String modifyPwd(UserDto userDto, String deviceId, String oldPwd, String newPwd);

    /**
     * 密码重置
     * @param userId
     * @param phone
     * @param deviceId
     * @param code
     * @param newPwd
     * @return
     */
    String resetPwd(UserDto userDto, String phone, String deviceId, String code, String newPwd);

    /**
     * 生成随机验证码
     * @param phone 手机号
     * @param length 长度
     * @param numFlag true-纯数字 false-数字字母组合
     * @return 流水号
     */
    void generateCode(String phone, int length, boolean numFlag,String scensType,String bindBeforePhone);



    /**
     * 手机号修改
     * @return
     */
    String modifyPhone(String userId, String phone, String code,UserDto userDto);


    int updateUserInfo(String userId,String path);
    /**
     *更新商户号 用于商户选取门店商户号
     */

    int updateUserInfoByUserId(String userId,String mchntNo,String mchntName,String userName,String cashirNo,String role,String email);

    /**
     *获取商户用户中间表信息
     * @param userId
     * @return
     */
    List<MchntBaseInfoDto> getMchntNoByUserId(String userId);


    /**
     * 初次设置用户交易密码
     * @param mchntNo
     * @param pwd
     * @return
     */
    String setMchntUserPwd(String mchntNo,String userId,String pwd);


    UserDto getUserInfoByMchntNo(String mchntNo);


    void updateQrCode(UserDto userDto,String modifyUserId) throws RuntimeException;
}
