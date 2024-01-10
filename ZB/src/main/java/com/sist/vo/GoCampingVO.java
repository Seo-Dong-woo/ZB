package com.sist.vo;

public class GoCampingVO {
   private int mno,hit;
   private String title,subtitle,poster,loc,num,envir,category,season,openclose,homepage,reserve,facility,pic1,pic2,pic3,explain;
   private String picc1,picc2,picc3,picc4,picc5,picc6,picc7,picc8,picc9,picc10;
   private String picc11,picc12,picc13,picc14,picc15,picc16,picc17,picc18,picc19,picc20;
   
   public String getPicc1() {
      return picc1;
   }
   public void setPicc1(String picc1) {
      this.picc1 = picc1;
   }
   public String getPicc2() {
      return picc2;
   }
   public void setPicc2(String picc2) {
      this.picc2 = picc2;
   }
   public String getPicc3() {
      return picc3;
   }
   public void setPicc3(String picc3) {
      this.picc3 = picc3;
   }
   public String getPicc4() {
      return picc4;
   }
   public void setPicc4(String picc4) {
      this.picc4 = picc4;
   }
   public String getPicc5() {
      return picc5;
   }
   public void setPicc5(String picc5) {
      this.picc5 = picc5;
   }
   public String getPicc6() {
      return picc6;
   }
   public void setPicc6(String picc6) {
      this.picc6 = picc6;
   }
   public String getPicc7() {
      return picc7;
   }
   public void setPicc7(String picc7) {
      this.picc7 = picc7;
   }
   public String getPicc8() {
      return picc8;
   }
   public void setPicc8(String picc8) {
      this.picc8 = picc8;
   }
   public String getPicc9() {
      return picc9;
   }
   public void setPicc9(String picc9) {
      this.picc9 = picc9;
   }
   public String getPicc10() {
      return picc10;
   }
   public void setPicc10(String picc10) {
      this.picc10 = picc10;
   }
   public String getPicc11() {
      return picc11;
   }
   public void setPicc11(String picc11) {
      this.picc11 = picc11;
   }
   public String getPicc12() {
      return picc12;
   }
   public void setPicc12(String picc12) {
      this.picc12 = picc12;
   }
   public String getPicc13() {
      return picc13;
   }
   public void setPicc13(String picc13) {
      this.picc13 = picc13;
   }
   public String getPicc14() {
      return picc14;
   }
   public void setPicc14(String picc14) {
      this.picc14 = picc14;
   }
   public String getPicc15() {
      return picc15;
   }
   public void setPicc15(String picc15) {
      this.picc15 = picc15;
   }
   public String getPicc16() {
      return picc16;
   }
   public void setPicc16(String picc16) {
      this.picc16 = picc16;
   }
   public String getPicc17() {
      return picc17;
   }
   public void setPicc17(String picc17) {
      this.picc17 = picc17;
   }
   public String getPicc18() {
      return picc18;
   }
   public void setPicc18(String picc18) {
      this.picc18 = picc18;
   }
   public String getPicc19() {
      return picc19;
   }
   public void setPicc19(String picc19) {
      this.picc19 = picc19;
   }
   public String getPicc20() {
      return picc20;
   }
   public void setPicc20(String picc20) {
      this.picc20 = picc20;
   }
   public int getMno() {
      return mno;
   }
   public void setMno(int mno) {
      this.mno = mno;
   }
   public String getTitle() {
      return title;
   }
   public void setTitle(String title) {
      this.title = title;
   }
   public String getSubtitle() {
      return subtitle;
   }
   public void setSubtitle(String subtitle) {
      this.subtitle = subtitle;
   }
   public String getPoster() {
      return poster;
   }
   public void setPoster(String poster) {
      this.poster = poster;
   }
   public String getLoc() {
      return loc;
   }
   public void setLoc(String loc) {
      this.loc = loc;
   }
   public String getNum() {
      return num;
   }
   public void setNum(String num) {
      this.num = num;
   }
   public String getEnvir() {
      return envir;
   }
   public void setEnvir(String envir) {
      this.envir = envir;
   }
   public String getCategory() {
      return category;
   }
   public void setCategory(String category) {
      this.category = category;
   }
   public String getSeason() {
      return season;
   }
   public void setSeason(String season) {
      this.season = season;
   }
   public String getOpenclose() {
      return openclose;
   }
   public void setOpenclose(String openclose) {
      this.openclose = openclose;
   }
   public String getHomepage() {
      return homepage;
   }
   public void setHomepage(String homepage) {
      this.homepage = homepage;
   }
   public String getReserve() {
      return reserve;
   }
   public void setReserve(String reserve) {
      this.reserve = reserve;
   }
   public String getFacility() {
      return facility;
   }
   public void setFacility(String facility) {
      this.facility = facility;
   }
   public String getPic1() {
      return pic1;
   }
   public void setPic1(String pic1) {
      this.pic1 = pic1;
   }
   public String getPic2() {
      return pic2;
   }
   public void setPic2(String pic2) {
      this.pic2 = pic2;
   }
   public String getPic3() {
      return pic3;
   }
   public void setPic3(String pic3) {
      this.pic3 = pic3;
   }
   public String getExplain() {
      return explain;
   }
   public void setExplain(String explain) {
      this.explain = explain;
   }
   public int getHit() {
      return hit;
   }
   public void setHit(int hit) {
      this.hit = hit;
   }
   public void setField(String fieldName, String value) 
    {
        // fieldName을 기반으로 필드를 동적으로 설정하는 메소드
        try 
        {
            // 예를 들어 fieldName이 "picc1"이면 setPicc1(value)를 호출하도록 가정
            String methodName = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
            getClass().getMethod(methodName, String.class).invoke(this, value);
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}