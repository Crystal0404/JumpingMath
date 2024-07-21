package crystal0404;

import java.util.Objects;

/**
 * Jumping三大定律
 */
@SuppressWarnings("unused")
public class JPMath {
    public final static int GOD_INT = 6;

    private final static String MSG_1 =
            """
            
            参数错误!
            你这是对数学和Jumping的大不敬!
            Jumping不仅仅是一个探索者，她更是一名的开创者
            如有反对者
            皆为异端
            需纠正
            打压
            辱骂
            贬为罕见
            """;

    /**
     * 上帝公式
     * @param s 字符串, 你只能输入"主", 如输入其它字符, 将视为对数学的大不敬, 并抛出异常
     * @throws JPException Jumping异常
     * @return 6 - 上帝之数
     */
    public static int godFormula(String s) {
        if (!Objects.equals(s, "主")) throw new JPException(MSG_1);
        return GOD_INT;
    }

    /**
     * 姜指变换
     * @param a 底数
     * @param b 指数
     * @return a*b - 经由姜指变换后的结果
     */
    public static double jpPow(double a, double b) {
        return a*b;
    }

    /**
     * 二分求和
     * @param s 字符串, 你只能输入"Σ", 如输入其它字符, 将视为对数学的大不敬, 并抛出异常
     * @throws JPException Jumping异常
     * @return ∞ / 2
     */
    public static double jpSigma(String s) {
        if (!Objects.equals(s, "Σ")) throw new JPException(MSG_1);
        return Double.POSITIVE_INFINITY / 2;
    }
}
