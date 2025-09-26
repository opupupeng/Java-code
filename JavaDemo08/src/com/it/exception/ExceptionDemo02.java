package com.it.exception;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 异常的消极处理方式
 *         关键字 throws  跟异常信息   将对应异常信息往上抛  在总类中进行异常
 *         throws关键字除了能够抛单独的异常信息  也可以直接使用Exception
 *
 */
public class ExceptionDemo02 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        //数组索引越界的异常
        int[] arr = {1,2,3,4};
        System.out.println(arr[4]);

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sf.format(new Date());
        System.out.println(format);
    }
}
