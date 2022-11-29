package vh;

import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes3.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f57339a = Pattern.compile("\\$\\{(.*?)\\}");

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
