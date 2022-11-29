package w2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;

@SuppressLint({"LogConditional"})
/* loaded from: classes.dex */
public class a {
    public static String a(Context context, int i10) {
        if (i10 != -1) {
            try {
                return context.getResources().getResourceEntryName(i10);
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder(12);
                sb2.append("?");
                sb2.append(i10);
                return sb2.toString();
            }
        }
        return "UNKNOWN";
    }

    public static String b(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
