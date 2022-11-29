package com.dena.mirrativ.mirrativapi.user;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryPaymentType;
import java.io.Serializable;
import java.util.List;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class ContractSummaryResponse implements Serializable {
    private final int accountStatus;
    private final String accountUrl;
    private final ContractSummaryBroadcastFee broadcastFee;
    private final int cash;
    private final int coinFromCash;
    private final int contractAcceptEndDate;
    private final int contractAcceptStartDate;
    private final int contractCashRate;
    private final int contractCoinRate;
    private final int contractGrade;
    private final int contractMonth;
    private final int contractMonthEndDate;
    private final int contractMonthPayDate;
    private final int contractMonthStartDate;
    private final int contractStatus;
    private final int currentCashRate;
    private final int currentCoinRate;
    private final int currentContractStatus;
    private final int currentGrade;
    private final int currentMonth;
    private final int currentMonthEndDate;
    private final int currentMonthPayDate;
    private final int currentMonthStartDate;
    private final int currentNextPayDate;
    @b(ContractSummaryPaymentType.TypeAdapter.class)
    private final ContractSummaryPaymentType currentPaymentType;
    private final int freeCoinChangeRate;
    private final ContractSummaryGift gift;
    private final String howToPageUrl;
    private final boolean isContractEnable;
    private final boolean isHandoverCodeRequired;
    private final boolean isVisibleHistory;
    private final boolean isVisibleRanking;
    private final int kycStatus;
    private final String kycUrl;
    private final String mainImageUrl;
    private final int paidCash;
    private final int paidCoinChangeRate;
    private final List<PaidCoinChangeRate> paidCoinChangeRates;
    private final int paymentStartDate;
    @b(ContractSummaryPaymentType.TypeAdapter.class)
    private final ContractSummaryPaymentType paymentType;
    private final int rankingGrade;
    private final int rankingMonth;
    private final int rankingMonthEndDate;
    private final int rankingMonthFromDate;
    private final int rankingMonthStartDate;
    private final int rankingMonthToDate;
    private final int rankingRank;
    private final int rankingScore;
    private final SeasonRatingStatusSeason season;
    private final Status status;
    private final int tax;
    private final String termsPageUrl;
    private final int totalCash;
    private final int validPaymentStartDate;

    public ContractSummaryResponse(String str, String str2, int i10, String str3, int i11, String str4, String str5, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, boolean z10, boolean z11, boolean z12, int i39, int i40, int i41, int i42, int i43, int i44, boolean z13, List<PaidCoinChangeRate> list, SeasonRatingStatusSeason seasonRatingStatusSeason, ContractSummaryBroadcastFee contractSummaryBroadcastFee, ContractSummaryGift contractSummaryGift, ContractSummaryPaymentType contractSummaryPaymentType, ContractSummaryPaymentType contractSummaryPaymentType2, int i45, int i46, int i47, Status status) {
        p.h(str, "mainImageUrl");
        p.h(str2, "termsPageUrl");
        p.h(str3, "accountUrl");
        p.h(str4, "kycUrl");
        p.h(str5, "howToPageUrl");
        p.h(list, "paidCoinChangeRates");
        p.h(seasonRatingStatusSeason, "season");
        p.h(contractSummaryBroadcastFee, "broadcastFee");
        p.h(contractSummaryPaymentType, "currentPaymentType");
        p.h(contractSummaryPaymentType2, "paymentType");
        p.h(status, "status");
        this.mainImageUrl = str;
        this.termsPageUrl = str2;
        this.accountStatus = i10;
        this.accountUrl = str3;
        this.kycStatus = i11;
        this.kycUrl = str4;
        this.howToPageUrl = str5;
        this.totalCash = i12;
        this.cash = i13;
        this.tax = i14;
        this.paidCash = i15;
        this.rankingMonthFromDate = i16;
        this.rankingMonthToDate = i17;
        this.currentMonth = i18;
        this.currentGrade = i19;
        this.contractMonth = i20;
        this.currentMonthStartDate = i21;
        this.currentMonthEndDate = i22;
        this.currentMonthPayDate = i23;
        this.currentNextPayDate = i24;
        this.contractAcceptStartDate = i25;
        this.contractAcceptEndDate = i26;
        this.contractMonthStartDate = i27;
        this.contractMonthPayDate = i28;
        this.contractMonthEndDate = i29;
        this.contractGrade = i30;
        this.rankingMonth = i31;
        this.rankingGrade = i32;
        this.rankingRank = i33;
        this.rankingScore = i34;
        this.rankingMonthStartDate = i35;
        this.rankingMonthEndDate = i36;
        this.paidCoinChangeRate = i37;
        this.freeCoinChangeRate = i38;
        this.isVisibleRanking = z10;
        this.isVisibleHistory = z11;
        this.isContractEnable = z12;
        this.contractStatus = i39;
        this.currentContractStatus = i40;
        this.contractCashRate = i41;
        this.contractCoinRate = i42;
        this.currentCoinRate = i43;
        this.currentCashRate = i44;
        this.isHandoverCodeRequired = z13;
        this.paidCoinChangeRates = list;
        this.season = seasonRatingStatusSeason;
        this.broadcastFee = contractSummaryBroadcastFee;
        this.gift = contractSummaryGift;
        this.currentPaymentType = contractSummaryPaymentType;
        this.paymentType = contractSummaryPaymentType2;
        this.paymentStartDate = i45;
        this.validPaymentStartDate = i46;
        this.coinFromCash = i47;
        this.status = status;
    }

    public final String component1() {
        return this.mainImageUrl;
    }

    public final int component10() {
        return this.tax;
    }

    public final int component11() {
        return this.paidCash;
    }

    public final int component12() {
        return this.rankingMonthFromDate;
    }

    public final int component13() {
        return this.rankingMonthToDate;
    }

    public final int component14() {
        return this.currentMonth;
    }

    public final int component15() {
        return this.currentGrade;
    }

    public final int component16() {
        return this.contractMonth;
    }

    public final int component17() {
        return this.currentMonthStartDate;
    }

    public final int component18() {
        return this.currentMonthEndDate;
    }

    public final int component19() {
        return this.currentMonthPayDate;
    }

    public final String component2() {
        return this.termsPageUrl;
    }

    public final int component20() {
        return this.currentNextPayDate;
    }

    public final int component21() {
        return this.contractAcceptStartDate;
    }

    public final int component22() {
        return this.contractAcceptEndDate;
    }

    public final int component23() {
        return this.contractMonthStartDate;
    }

    public final int component24() {
        return this.contractMonthPayDate;
    }

    public final int component25() {
        return this.contractMonthEndDate;
    }

    public final int component26() {
        return this.contractGrade;
    }

    public final int component27() {
        return this.rankingMonth;
    }

    public final int component28() {
        return this.rankingGrade;
    }

    public final int component29() {
        return this.rankingRank;
    }

    public final int component3() {
        return this.accountStatus;
    }

    public final int component30() {
        return this.rankingScore;
    }

    public final int component31() {
        return this.rankingMonthStartDate;
    }

    public final int component32() {
        return this.rankingMonthEndDate;
    }

    public final int component33() {
        return this.paidCoinChangeRate;
    }

    public final int component34() {
        return this.freeCoinChangeRate;
    }

    public final boolean component35() {
        return this.isVisibleRanking;
    }

    public final boolean component36() {
        return this.isVisibleHistory;
    }

    public final boolean component37() {
        return this.isContractEnable;
    }

    public final int component38() {
        return this.contractStatus;
    }

    public final int component39() {
        return this.currentContractStatus;
    }

    public final String component4() {
        return this.accountUrl;
    }

    public final int component40() {
        return this.contractCashRate;
    }

    public final int component41() {
        return this.contractCoinRate;
    }

    public final int component42() {
        return this.currentCoinRate;
    }

    public final int component43() {
        return this.currentCashRate;
    }

    public final boolean component44() {
        return this.isHandoverCodeRequired;
    }

    public final List<PaidCoinChangeRate> component45() {
        return this.paidCoinChangeRates;
    }

    public final SeasonRatingStatusSeason component46() {
        return this.season;
    }

    public final ContractSummaryBroadcastFee component47() {
        return this.broadcastFee;
    }

    public final ContractSummaryGift component48() {
        return this.gift;
    }

    public final ContractSummaryPaymentType component49() {
        return this.currentPaymentType;
    }

    public final int component5() {
        return this.kycStatus;
    }

    public final ContractSummaryPaymentType component50() {
        return this.paymentType;
    }

    public final int component51() {
        return this.paymentStartDate;
    }

    public final int component52() {
        return this.validPaymentStartDate;
    }

    public final int component53() {
        return this.coinFromCash;
    }

    public final Status component54() {
        return this.status;
    }

    public final String component6() {
        return this.kycUrl;
    }

    public final String component7() {
        return this.howToPageUrl;
    }

    public final int component8() {
        return this.totalCash;
    }

    public final int component9() {
        return this.cash;
    }

    public final ContractSummaryResponse copy(String str, String str2, int i10, String str3, int i11, String str4, String str5, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, boolean z10, boolean z11, boolean z12, int i39, int i40, int i41, int i42, int i43, int i44, boolean z13, List<PaidCoinChangeRate> list, SeasonRatingStatusSeason seasonRatingStatusSeason, ContractSummaryBroadcastFee contractSummaryBroadcastFee, ContractSummaryGift contractSummaryGift, ContractSummaryPaymentType contractSummaryPaymentType, ContractSummaryPaymentType contractSummaryPaymentType2, int i45, int i46, int i47, Status status) {
        p.h(str, "mainImageUrl");
        p.h(str2, "termsPageUrl");
        p.h(str3, "accountUrl");
        p.h(str4, "kycUrl");
        p.h(str5, "howToPageUrl");
        p.h(list, "paidCoinChangeRates");
        p.h(seasonRatingStatusSeason, "season");
        p.h(contractSummaryBroadcastFee, "broadcastFee");
        p.h(contractSummaryPaymentType, "currentPaymentType");
        p.h(contractSummaryPaymentType2, "paymentType");
        p.h(status, "status");
        return new ContractSummaryResponse(str, str2, i10, str3, i11, str4, str5, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38, z10, z11, z12, i39, i40, i41, i42, i43, i44, z13, list, seasonRatingStatusSeason, contractSummaryBroadcastFee, contractSummaryGift, contractSummaryPaymentType, contractSummaryPaymentType2, i45, i46, i47, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContractSummaryResponse) {
            ContractSummaryResponse contractSummaryResponse = (ContractSummaryResponse) obj;
            return p.c(this.mainImageUrl, contractSummaryResponse.mainImageUrl) && p.c(this.termsPageUrl, contractSummaryResponse.termsPageUrl) && this.accountStatus == contractSummaryResponse.accountStatus && p.c(this.accountUrl, contractSummaryResponse.accountUrl) && this.kycStatus == contractSummaryResponse.kycStatus && p.c(this.kycUrl, contractSummaryResponse.kycUrl) && p.c(this.howToPageUrl, contractSummaryResponse.howToPageUrl) && this.totalCash == contractSummaryResponse.totalCash && this.cash == contractSummaryResponse.cash && this.tax == contractSummaryResponse.tax && this.paidCash == contractSummaryResponse.paidCash && this.rankingMonthFromDate == contractSummaryResponse.rankingMonthFromDate && this.rankingMonthToDate == contractSummaryResponse.rankingMonthToDate && this.currentMonth == contractSummaryResponse.currentMonth && this.currentGrade == contractSummaryResponse.currentGrade && this.contractMonth == contractSummaryResponse.contractMonth && this.currentMonthStartDate == contractSummaryResponse.currentMonthStartDate && this.currentMonthEndDate == contractSummaryResponse.currentMonthEndDate && this.currentMonthPayDate == contractSummaryResponse.currentMonthPayDate && this.currentNextPayDate == contractSummaryResponse.currentNextPayDate && this.contractAcceptStartDate == contractSummaryResponse.contractAcceptStartDate && this.contractAcceptEndDate == contractSummaryResponse.contractAcceptEndDate && this.contractMonthStartDate == contractSummaryResponse.contractMonthStartDate && this.contractMonthPayDate == contractSummaryResponse.contractMonthPayDate && this.contractMonthEndDate == contractSummaryResponse.contractMonthEndDate && this.contractGrade == contractSummaryResponse.contractGrade && this.rankingMonth == contractSummaryResponse.rankingMonth && this.rankingGrade == contractSummaryResponse.rankingGrade && this.rankingRank == contractSummaryResponse.rankingRank && this.rankingScore == contractSummaryResponse.rankingScore && this.rankingMonthStartDate == contractSummaryResponse.rankingMonthStartDate && this.rankingMonthEndDate == contractSummaryResponse.rankingMonthEndDate && this.paidCoinChangeRate == contractSummaryResponse.paidCoinChangeRate && this.freeCoinChangeRate == contractSummaryResponse.freeCoinChangeRate && this.isVisibleRanking == contractSummaryResponse.isVisibleRanking && this.isVisibleHistory == contractSummaryResponse.isVisibleHistory && this.isContractEnable == contractSummaryResponse.isContractEnable && this.contractStatus == contractSummaryResponse.contractStatus && this.currentContractStatus == contractSummaryResponse.currentContractStatus && this.contractCashRate == contractSummaryResponse.contractCashRate && this.contractCoinRate == contractSummaryResponse.contractCoinRate && this.currentCoinRate == contractSummaryResponse.currentCoinRate && this.currentCashRate == contractSummaryResponse.currentCashRate && this.isHandoverCodeRequired == contractSummaryResponse.isHandoverCodeRequired && p.c(this.paidCoinChangeRates, contractSummaryResponse.paidCoinChangeRates) && p.c(this.season, contractSummaryResponse.season) && p.c(this.broadcastFee, contractSummaryResponse.broadcastFee) && p.c(this.gift, contractSummaryResponse.gift) && this.currentPaymentType == contractSummaryResponse.currentPaymentType && this.paymentType == contractSummaryResponse.paymentType && this.paymentStartDate == contractSummaryResponse.paymentStartDate && this.validPaymentStartDate == contractSummaryResponse.validPaymentStartDate && this.coinFromCash == contractSummaryResponse.coinFromCash && p.c(this.status, contractSummaryResponse.status);
        }
        return false;
    }

    public final int getAccountStatus() {
        return this.accountStatus;
    }

    public final String getAccountUrl() {
        return this.accountUrl;
    }

    public final ContractSummaryBroadcastFee getBroadcastFee() {
        return this.broadcastFee;
    }

    public final int getCash() {
        return this.cash;
    }

    public final int getCoinFromCash() {
        return this.coinFromCash;
    }

    public final int getContractAcceptEndDate() {
        return this.contractAcceptEndDate;
    }

    public final int getContractAcceptStartDate() {
        return this.contractAcceptStartDate;
    }

    public final int getContractCashRate() {
        return this.contractCashRate;
    }

    public final int getContractCoinRate() {
        return this.contractCoinRate;
    }

    public final int getContractGrade() {
        return this.contractGrade;
    }

    public final int getContractMonth() {
        return this.contractMonth;
    }

    public final int getContractMonthEndDate() {
        return this.contractMonthEndDate;
    }

    public final int getContractMonthPayDate() {
        return this.contractMonthPayDate;
    }

    public final int getContractMonthStartDate() {
        return this.contractMonthStartDate;
    }

    public final int getContractStatus() {
        return this.contractStatus;
    }

    public final int getCurrentCashRate() {
        return this.currentCashRate;
    }

    public final int getCurrentCoinRate() {
        return this.currentCoinRate;
    }

    public final int getCurrentContractStatus() {
        return this.currentContractStatus;
    }

    public final int getCurrentGrade() {
        return this.currentGrade;
    }

    public final int getCurrentMonth() {
        return this.currentMonth;
    }

    public final int getCurrentMonthEndDate() {
        return this.currentMonthEndDate;
    }

    public final int getCurrentMonthPayDate() {
        return this.currentMonthPayDate;
    }

    public final int getCurrentMonthStartDate() {
        return this.currentMonthStartDate;
    }

    public final int getCurrentNextPayDate() {
        return this.currentNextPayDate;
    }

    public final ContractSummaryPaymentType getCurrentPaymentType() {
        return this.currentPaymentType;
    }

    public final int getFreeCoinChangeRate() {
        return this.freeCoinChangeRate;
    }

    public final ContractSummaryGift getGift() {
        return this.gift;
    }

    public final String getHowToPageUrl() {
        return this.howToPageUrl;
    }

    public final int getKycStatus() {
        return this.kycStatus;
    }

    public final String getKycUrl() {
        return this.kycUrl;
    }

    public final String getMainImageUrl() {
        return this.mainImageUrl;
    }

    public final int getPaidCash() {
        return this.paidCash;
    }

    public final int getPaidCoinChangeRate() {
        return this.paidCoinChangeRate;
    }

    public final List<PaidCoinChangeRate> getPaidCoinChangeRates() {
        return this.paidCoinChangeRates;
    }

    public final int getPaymentStartDate() {
        return this.paymentStartDate;
    }

    public final ContractSummaryPaymentType getPaymentType() {
        return this.paymentType;
    }

    public final int getRankingGrade() {
        return this.rankingGrade;
    }

    public final int getRankingMonth() {
        return this.rankingMonth;
    }

    public final int getRankingMonthEndDate() {
        return this.rankingMonthEndDate;
    }

    public final int getRankingMonthFromDate() {
        return this.rankingMonthFromDate;
    }

    public final int getRankingMonthStartDate() {
        return this.rankingMonthStartDate;
    }

    public final int getRankingMonthToDate() {
        return this.rankingMonthToDate;
    }

    public final int getRankingRank() {
        return this.rankingRank;
    }

    public final int getRankingScore() {
        return this.rankingScore;
    }

    public final SeasonRatingStatusSeason getSeason() {
        return this.season;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final int getTax() {
        return this.tax;
    }

    public final String getTermsPageUrl() {
        return this.termsPageUrl;
    }

    public final int getTotalCash() {
        return this.totalCash;
    }

    public final int getValidPaymentStartDate() {
        return this.validPaymentStartDate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.mainImageUrl.hashCode() * 31) + this.termsPageUrl.hashCode()) * 31) + Integer.hashCode(this.accountStatus)) * 31) + this.accountUrl.hashCode()) * 31) + Integer.hashCode(this.kycStatus)) * 31) + this.kycUrl.hashCode()) * 31) + this.howToPageUrl.hashCode()) * 31) + Integer.hashCode(this.totalCash)) * 31) + Integer.hashCode(this.cash)) * 31) + Integer.hashCode(this.tax)) * 31) + Integer.hashCode(this.paidCash)) * 31) + Integer.hashCode(this.rankingMonthFromDate)) * 31) + Integer.hashCode(this.rankingMonthToDate)) * 31) + Integer.hashCode(this.currentMonth)) * 31) + Integer.hashCode(this.currentGrade)) * 31) + Integer.hashCode(this.contractMonth)) * 31) + Integer.hashCode(this.currentMonthStartDate)) * 31) + Integer.hashCode(this.currentMonthEndDate)) * 31) + Integer.hashCode(this.currentMonthPayDate)) * 31) + Integer.hashCode(this.currentNextPayDate)) * 31) + Integer.hashCode(this.contractAcceptStartDate)) * 31) + Integer.hashCode(this.contractAcceptEndDate)) * 31) + Integer.hashCode(this.contractMonthStartDate)) * 31) + Integer.hashCode(this.contractMonthPayDate)) * 31) + Integer.hashCode(this.contractMonthEndDate)) * 31) + Integer.hashCode(this.contractGrade)) * 31) + Integer.hashCode(this.rankingMonth)) * 31) + Integer.hashCode(this.rankingGrade)) * 31) + Integer.hashCode(this.rankingRank)) * 31) + Integer.hashCode(this.rankingScore)) * 31) + Integer.hashCode(this.rankingMonthStartDate)) * 31) + Integer.hashCode(this.rankingMonthEndDate)) * 31) + Integer.hashCode(this.paidCoinChangeRate)) * 31) + Integer.hashCode(this.freeCoinChangeRate)) * 31;
        boolean z10 = this.isVisibleRanking;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.isVisibleHistory;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.isContractEnable;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int hashCode2 = (((((((((((((i13 + i14) * 31) + Integer.hashCode(this.contractStatus)) * 31) + Integer.hashCode(this.currentContractStatus)) * 31) + Integer.hashCode(this.contractCashRate)) * 31) + Integer.hashCode(this.contractCoinRate)) * 31) + Integer.hashCode(this.currentCoinRate)) * 31) + Integer.hashCode(this.currentCashRate)) * 31;
        boolean z13 = this.isHandoverCodeRequired;
        int hashCode3 = (((((((hashCode2 + (z13 ? 1 : z13 ? 1 : 0)) * 31) + this.paidCoinChangeRates.hashCode()) * 31) + this.season.hashCode()) * 31) + this.broadcastFee.hashCode()) * 31;
        ContractSummaryGift contractSummaryGift = this.gift;
        return ((((((((((((hashCode3 + (contractSummaryGift == null ? 0 : contractSummaryGift.hashCode())) * 31) + this.currentPaymentType.hashCode()) * 31) + this.paymentType.hashCode()) * 31) + Integer.hashCode(this.paymentStartDate)) * 31) + Integer.hashCode(this.validPaymentStartDate)) * 31) + Integer.hashCode(this.coinFromCash)) * 31) + this.status.hashCode();
    }

    public final boolean isContractEnable() {
        return this.isContractEnable;
    }

    public final boolean isHandoverCodeRequired() {
        return this.isHandoverCodeRequired;
    }

    public final boolean isVisibleHistory() {
        return this.isVisibleHistory;
    }

    public final boolean isVisibleRanking() {
        return this.isVisibleRanking;
    }

    public String toString() {
        return "ContractSummaryResponse(mainImageUrl=" + this.mainImageUrl + ", termsPageUrl=" + this.termsPageUrl + ", accountStatus=" + this.accountStatus + ", accountUrl=" + this.accountUrl + ", kycStatus=" + this.kycStatus + ", kycUrl=" + this.kycUrl + ", howToPageUrl=" + this.howToPageUrl + ", totalCash=" + this.totalCash + ", cash=" + this.cash + ", tax=" + this.tax + ", paidCash=" + this.paidCash + ", rankingMonthFromDate=" + this.rankingMonthFromDate + ", rankingMonthToDate=" + this.rankingMonthToDate + ", currentMonth=" + this.currentMonth + ", currentGrade=" + this.currentGrade + ", contractMonth=" + this.contractMonth + ", currentMonthStartDate=" + this.currentMonthStartDate + ", currentMonthEndDate=" + this.currentMonthEndDate + ", currentMonthPayDate=" + this.currentMonthPayDate + ", currentNextPayDate=" + this.currentNextPayDate + ", contractAcceptStartDate=" + this.contractAcceptStartDate + ", contractAcceptEndDate=" + this.contractAcceptEndDate + ", contractMonthStartDate=" + this.contractMonthStartDate + ", contractMonthPayDate=" + this.contractMonthPayDate + ", contractMonthEndDate=" + this.contractMonthEndDate + ", contractGrade=" + this.contractGrade + ", rankingMonth=" + this.rankingMonth + ", rankingGrade=" + this.rankingGrade + ", rankingRank=" + this.rankingRank + ", rankingScore=" + this.rankingScore + ", rankingMonthStartDate=" + this.rankingMonthStartDate + ", rankingMonthEndDate=" + this.rankingMonthEndDate + ", paidCoinChangeRate=" + this.paidCoinChangeRate + ", freeCoinChangeRate=" + this.freeCoinChangeRate + ", isVisibleRanking=" + this.isVisibleRanking + ", isVisibleHistory=" + this.isVisibleHistory + ", isContractEnable=" + this.isContractEnable + ", contractStatus=" + this.contractStatus + ", currentContractStatus=" + this.currentContractStatus + ", contractCashRate=" + this.contractCashRate + ", contractCoinRate=" + this.contractCoinRate + ", currentCoinRate=" + this.currentCoinRate + ", currentCashRate=" + this.currentCashRate + ", isHandoverCodeRequired=" + this.isHandoverCodeRequired + ", paidCoinChangeRates=" + this.paidCoinChangeRates + ", season=" + this.season + ", broadcastFee=" + this.broadcastFee + ", gift=" + this.gift + ", currentPaymentType=" + this.currentPaymentType + ", paymentType=" + this.paymentType + ", paymentStartDate=" + this.paymentStartDate + ", validPaymentStartDate=" + this.validPaymentStartDate + ", coinFromCash=" + this.coinFromCash + ", status=" + this.status + ')';
    }
}
