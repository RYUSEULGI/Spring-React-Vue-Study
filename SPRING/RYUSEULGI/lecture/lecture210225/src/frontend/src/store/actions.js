import {
  FETCH_BOARD_LIST,
  FETCH_BOARD
} from './mutation-types'

import axios from 'axios'

export default {
  fetchBoardList ({ commit }) {
    return axios.get('http://localhost:7777/boards')
      .then(res => {
        commit(FETCH_BOARD_LIST, res.data)
      })
  },
  fetchBoard ({ commit }, boardNo) {
    console.log('fetchBoard ' + commit + ', boardNo = ' + boardNo)
    return axios.get(`http://localhost:7777/boards/${boardNo}`)
      .then(res => {
        console.log('fetchBoard - res: ' + res.data)
        commit(FETCH_BOARD, res.data)
      })
  },
  generateRandomNumber ({ commit }) {
    axios.get('http://localhost:7777/random')
      .then((res) => {
        console.log('res = ' + parseInt(res.data.randNumber))
        commit('successGenerateRandomNumber', parseInt(res.data.randNumber))
      })
      .catch (error => {
        console.log(error.response);
      })
  }
}
