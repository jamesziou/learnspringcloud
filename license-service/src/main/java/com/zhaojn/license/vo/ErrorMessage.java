/*
 * Copyright (C), 2015-2021, zhaojn
 * FileName: ErrorMessage
 * Author:   zhaojn
 * Date:     2021/4/9 22:50
 * Description: 错误消息
 * History:
 * 作者姓名          修改时间          版本号          描述
 * zhaojn           2021/4/9 22:50   1.0.0           初版
 */

package com.zhaojn.license.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 错误消息<br>
 *
 * @author zhaojn
 * @create 2021/4/9
 * @since 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {

  private String code;

  private String message;
}
