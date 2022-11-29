package ai;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class b1 extends a2 {
    public b1(r0 r0Var, String str, String str2, c64 c64Var, int i10, int i11) {
        super(r0Var, "pECbn1i7ArZz8HseR71ZVkvFfTp84DNv2haWC1WmGQudMO74UcIxEa2NyELtzZhK", "LbaQh8VAFWEQeupBiMdSh8EgMse5yKT8p6jkCYTG+aQ=", c64Var, i10, 49);
    }

    @Override // ai.a2
    public final void a() throws IllegalAccessException, InvocationTargetException {
        this.f1688e.O(3);
        try {
            int i10 = 1;
            boolean booleanValue = ((Boolean) this.f1689f.invoke(null, this.f1685b.c())).booleanValue();
            c64 c64Var = this.f1688e;
            if (true == booleanValue) {
                i10 = 2;
            }
            c64Var.O(i10);
        } catch (InvocationTargetException e10) {
            if (!(e10.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e10;
            }
        }
    }
}
