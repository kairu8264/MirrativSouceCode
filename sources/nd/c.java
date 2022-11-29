package nd;

import com.dena.mirrorman.clientlog.logs.EventBannerTargetType;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public enum c {
    NONE(0),
    EVENT(2),
    INTERNAL(3);
    
    public static final a Companion = new a(null);
    private final int rawValue;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c a(int i10) {
            c cVar;
            c[] values = c.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    cVar = null;
                    break;
                }
                cVar = values[i11];
                if (cVar.c() == i10) {
                    break;
                }
                i11++;
            }
            return cVar == null ? c.NONE : cVar;
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f41943a;

        static {
            int[] iArr = new int[c.values().length];
            iArr[c.EVENT.ordinal()] = 1;
            iArr[c.INTERNAL.ordinal()] = 2;
            iArr[c.NONE.ordinal()] = 3;
            f41943a = iArr;
        }
    }

    c(int i10) {
        this.rawValue = i10;
    }

    public final int c() {
        return this.rawValue;
    }

    public final EventBannerTargetType e() {
        int i10 = b.f41943a[ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return EventBannerTargetType.NONE;
                }
                throw new NoWhenBranchMatchedException();
            }
            return EventBannerTargetType.EVENT_RANKING_TARGET_TYPE;
        }
        return EventBannerTargetType.EVENT_TARGET_TYPE;
    }
}
