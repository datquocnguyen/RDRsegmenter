# A Fast and Accurate Vietnamese Word Segmenter

The implementation of RDRsegmenter, as described in my paper:

	@article{NguyenNVDJ2017,
	author={Dat Quoc Nguyen and Dai Quoc Nguyen and Thanh Vu and Mark Dras and Mark Johnson},
	title={{A Fast and Accurate Vietnamese Word Segmenter}},
	journal={arXiv preprint arXiv:1709.06307},
	year={2017},
	url={https://arxiv.org/abs/1709.06307}
	}

Please cite the paper above whenever RDRsegmenter is used to produce published results or incorporated into other software. I would highly appreciate to have your bug reports, comments and suggestions about RDRsegmenter. As a free open-source implementation, RDRsegmenter is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

## Usage

Supposed that Java 1.8+ is already set to run in command line or terminal (for example: adding Java to the path environment variable in Windows OS). To compile RDRsegmenter, users simply run the following command:

	$ javac -encoding UTF-8 RDRsegmenter.java

Then users can run RDRsegmenter to segment a raw text corpus (e.g. a collection of news content):

	$ java RDRsegmenter PATH-TO-RAW-TEXT-CORPUS

An output `.WS` file will be generated in the same directory containing the raw text corpus.

## API

	//Change path to "VnVocab" in line 14 in "Vocabulary.java" if necessary
	//Change path to "Model.RDR" in line 24 in "RDRsegmenter.java" if necessary
	RDRsegmenter segmenter = new RDRsegmenter(); //Model loading
	
	//Perform word segmentation on text string
	String outStr1 = segmenter.segmentRawString("Tính thuế thu nhập cá nhân (TNCN) từ tiền lương.");
	String outStr2 = segmenter.segmentTokenizedString("Tính thuế thu nhập cá nhân ( TNCN ) từ tiền lương .");

	//Perform word segmentation on text corpora
	segmenter.segmentRawCorpus("PATH-TO-RAW-TEXT-CORPUS");
	segmenter.segmentTokenizedCorpus("PATH-TO-TOKENIZED-TEXT-CORPUS");
