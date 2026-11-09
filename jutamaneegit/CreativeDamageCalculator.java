/**
 * Project Name: Disaster & Environment Damage Calculator
 * License: kvc
 * Author: Jutamanee malila
 * Student ID / Class: 67219030022 / ปวช.3
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */
public class CreativeDamageCalculator {

    /**
     * ฟังก์ชันคำนวณความเสียหายเชิงสร้างสรรค์
     */
    public static double calculateDamage(double floodLevel, double floodDays) {
        // 1. คำนวณค่าความเสียหายตามสูตรที่นักเรียนออกแบบ
        double rawDamage = (floodLevel * 1.5) * (floodDays * 2.0); 

        // 2. บูรณาการภูมิคุ้มกัน: เช็กขอบเขตข้อมูลเพื่อป้องกันไม่ให้ผลลัพธ์เป็นลบ (Input Validation)
        if (rawDamage < 0 || floodLevel < 0 || floodDays < 0) {
            return 0.0; // คืนค่าความเสียหายเป็น 0
        }
        
        return rawDamage;
    }

    public static void main(String[] args) {
        // กำหนดค่าตัวแปรทดสอบ (ตัวอย่าง: น้ำท่วมสูง 50 ซม. เป็นเวลา 3 วัน)
        double testInput1 = 50.0; 
        double testInput2 = 3.0; 

        // เรียกใช้งานฟังก์ชัน
        double result = calculateDamage(testInput1, testInput2);

        // แสดงผลลัพธ์การทำงาน
        System.out.println("==========================================");
        System.out.println("ระบบประมวลผลความเสียหายเชิงสร้างสรรค์");
        System.out.println("ผลการคำนวณความเสียหายที่เกิดขึ้น: " + result + " หน่วย");
        System.out.println("==========================================");
    }
}
