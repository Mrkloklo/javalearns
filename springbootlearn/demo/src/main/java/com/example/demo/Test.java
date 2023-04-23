package com.example.demo;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.Random;
import java.util.UUID;

public class Test {
    private static final int WIDTH = 100;
    private static final int HEIGHT = 40;
    private static final int FONT_SIZE = 20;
    private static final int CODE_LENGTH = 4;

    private static final String[] CODES = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    public static String generateCaptcha() throws Exception {
        // 创建一个缓冲图像对象
        BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        // 获取图形上下文
        Graphics g = image.getGraphics();
        // 设置背景色
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        // 设置字体
        g.setFont(new Font("Arial", Font.BOLD, FONT_SIZE));
        // 生成随机类
        Random random = new Random();
        // 生成验证码
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < CODE_LENGTH; i++) {
            String str = CODES[random.nextInt(CODES.length)];
            code.append(str);
            // 设置字体颜色
            g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            // 绘制字符
            g.drawString(str, (i * WIDTH / CODE_LENGTH) + 5, HEIGHT - 10 - random.nextInt(10));
        }
        // 将验证码图片转换为Base64字符串
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(image, "jpeg", baos);
        String base64Image = "data:image/jpeg;base64," + java.util.Base64.getEncoder().encodeToString(baos.toByteArray());
        baos.close();
        // 生成UUID
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
        System.out.println(base64Image);
        System.out.println(code);
        // 返回结果
        return "";
    }

}