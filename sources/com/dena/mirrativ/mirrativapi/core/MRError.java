package com.dena.mirrativ.mirrativapi.core;

import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public abstract class MRError {

    /* loaded from: classes2.dex */
    public static final class Banned extends MRError {
        private final String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Banned(String str) {
            super(null);
            p.h(str, "errorMessage");
            this.errorMessage = str;
        }

        public static /* synthetic */ Banned copy$default(Banned banned, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = banned.errorMessage;
            }
            return banned.copy(str);
        }

        public final String component1() {
            return this.errorMessage;
        }

        public final Banned copy(String str) {
            p.h(str, "errorMessage");
            return new Banned(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Banned) && p.c(this.errorMessage, ((Banned) obj).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return "Banned(errorMessage=" + this.errorMessage + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class Blocked extends MRError {
        private final String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Blocked(String str) {
            super(null);
            p.h(str, "errorMessage");
            this.errorMessage = str;
        }

        public static /* synthetic */ Blocked copy$default(Blocked blocked, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = blocked.errorMessage;
            }
            return blocked.copy(str);
        }

        public final String component1() {
            return this.errorMessage;
        }

        public final Blocked copy(String str) {
            p.h(str, "errorMessage");
            return new Blocked(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Blocked) && p.c(this.errorMessage, ((Blocked) obj).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return "Blocked(errorMessage=" + this.errorMessage + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class Failure extends MRError {
        private final String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(String str) {
            super(null);
            p.h(str, "errorMessage");
            this.errorMessage = str;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = failure.errorMessage;
            }
            return failure.copy(str);
        }

        public final String component1() {
            return this.errorMessage;
        }

        public final Failure copy(String str) {
            p.h(str, "errorMessage");
            return new Failure(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && p.c(this.errorMessage, ((Failure) obj).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return "Failure(errorMessage=" + this.errorMessage + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class ForceUpdate extends MRError {
        public static final ForceUpdate INSTANCE = new ForceUpdate();

        private ForceUpdate() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Maintenance extends MRError {
        public static final Maintenance INSTANCE = new Maintenance();

        private Maintenance() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Network extends MRError {
        public static final Network INSTANCE = new Network();

        private Network() {
            super(null);
        }
    }

    private MRError() {
    }

    public /* synthetic */ MRError(h hVar) {
        this();
    }

    public final String getMessage() {
        if (this instanceof Failure) {
            return ((Failure) this).getErrorMessage();
        }
        if (this instanceof Banned) {
            return ((Banned) this).getErrorMessage();
        }
        if (this instanceof Blocked) {
            return ((Blocked) this).getErrorMessage();
        }
        return null;
    }
}
