package ai;

import com.google.android.gms.internal.ads.zzdd;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class v82 extends lv1 {

    /* renamed from: i  reason: collision with root package name */
    public static final int f11006i = Float.floatToIntBits(Float.NaN);

    public static void n(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == f11006i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // ai.u71
    public final void g(ByteBuffer byteBuffer) {
        ByteBuffer h10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f6695b.f10150c;
        if (i11 == 536870912) {
            h10 = h((i10 / 3) * 4);
            while (position < limit) {
                n(((byteBuffer.get(position) & TagConstant.TAG_CAT_RESERVED) << 8) | ((byteBuffer.get(position + 1) & TagConstant.TAG_CAT_RESERVED) << 16) | ((byteBuffer.get(position + 2) & TagConstant.TAG_CAT_RESERVED) << 24), h10);
                position += 3;
            }
        } else if (i11 == 805306368) {
            h10 = h(i10);
            while (position < limit) {
                n((byteBuffer.get(position) & TagConstant.TAG_CAT_RESERVED) | ((byteBuffer.get(position + 1) & TagConstant.TAG_CAT_RESERVED) << 8) | ((byteBuffer.get(position + 2) & TagConstant.TAG_CAT_RESERVED) << 16) | ((byteBuffer.get(position + 3) & TagConstant.TAG_CAT_RESERVED) << 24), h10);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        h10.flip();
    }

    @Override // ai.lv1
    public final t51 j(t51 t51Var) throws zzdd {
        int i10 = t51Var.f10150c;
        if (sb.q(i10)) {
            return i10 != 4 ? new t51(t51Var.f10148a, t51Var.f10149b, 4) : t51.f10147e;
        }
        throw new zzdd(t51Var);
    }
}
