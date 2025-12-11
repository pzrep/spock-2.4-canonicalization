package com.github.pzrep.russel

class VoteFilter implements RusselFilter<Integer> {
    boolean accept(Integer vote) {
        vote % 7 != 0
    }
}
