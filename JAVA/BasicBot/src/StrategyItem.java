public enum StrategyItem {
    // 벙커가 있으면 마린을 벙커에 집어 넣는다.
    AUTO_TRAIN_BIONIC_UNIT, // 자동으로 바이오닉 유닛을  훈련한다.

    AUTO_UPGRADE_U_238_Shells, // 자동으로 마린 사거리 업그레이드를 한다.
    AUTO_UPGRADE_STIMPACK, // 자동으로 스팀팩 업그레이드를 한다.

    AUTO_ADDON_COMSAT_STATION, // 자동으로 컴샛 스테이션 애드온을 단다.

    AUTO_USING_SCAN, // 자동으로 스캔을 사용한다.

    AUTO_LOAD_MARINE_TO_BUNKER, // 자동으로 마린이 벙커로 들어간다.
    AUTO_REPAIR_BUNKER, // 자동으로 벙커를 수리한다.
    AUTO_DEFENCE_ALLIANCE_BASE, // 본진을 공격한 적 유닛을 자동으로 공격한다.

    AGGRESSIVE_MOVE_ATTACK, // 공격 후 쿨 타임 차는 동안 Move로 적 방향으로 이동한다.
    SET_BARRACKS_RALLY // 자동으로 배럭의 랠리 포인트가 아군의 FirstChokePoint로 찍한다.
}
