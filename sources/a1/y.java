package a1;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public enum y implements x {
    Active,
    ActiveParent,
    Captured,
    Deactivated,
    DeactivatedParent,
    Inactive;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f359a;

        static {
            int[] iArr = new int[y.values().length];
            iArr[y.Captured.ordinal()] = 1;
            iArr[y.Active.ordinal()] = 2;
            iArr[y.ActiveParent.ordinal()] = 3;
            iArr[y.Deactivated.ordinal()] = 4;
            iArr[y.DeactivatedParent.ordinal()] = 5;
            iArr[y.Inactive.ordinal()] = 6;
            f359a = iArr;
        }
    }

    @Override // a1.x
    public boolean a() {
        switch (a.f359a[ordinal()]) {
            case 1:
            case 2:
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public boolean e() {
        switch (a.f359a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 5:
                return true;
            case 4:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean h() {
        switch (a.f359a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 6:
                return false;
            case 4:
            case 5:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
