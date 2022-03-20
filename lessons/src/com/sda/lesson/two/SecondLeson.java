package com.sda.lesson.two;
/*
*
* Krijoni nje interface qe ka 3 metodat:
  -> gjej maximuminEArray
  -> gjej shumen e numrave nga parametri i pare deri tek parametri 2()
  -> printoTeGjitheFjalet qe mbarojne me shkronjen R.


  Krijoni klasen SecondLessonImpl qe implementon interfacin SecondLesson dhe
  ka si members nje array me Integer dhe nje array me String

Pasi te kemi mbaruar me nderiimin e klases do ndertojme nje klase tjeter ku do jete dhe klasa main e programit tone
* */
public interface SecondLeson {

    Integer findMax();
    void findSum(Integer number, Integer number2);
    void printWordsThatEndsWithLetterR();
}
