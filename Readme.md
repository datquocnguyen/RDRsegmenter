# A Fast and Accurate Vietnamese Word Segmenter

The implementation of RDRsegmenter, as described in [our paper](http://www.lrec-conf.org/proceedings/lrec2018/summaries/55.html):

	@InProceedings{NguyenNVDJ2018,
	author={Dat Quoc Nguyen and Dai Quoc Nguyen and Thanh Vu and Mark Dras and Mark Johnson},
	title={{A Fast and Accurate Vietnamese Word Segmenter}},
	booktitle={Proceedings of the 11th International Conference on Language Resources and Evaluation (LREC 2018)},
	pages={2582--2587},
	year={2018},
	url={http://www.lrec-conf.org/proceedings/lrec2018/pdf/55.pdf}
	}

**Please cite** our LREC 2018 paper whenever RDRsegmenter is used to produce published results or incorporated into other software. 

RDRsegmenter has also been incorporated into our Java NLP annotation pipeline [VnCoreNLP](https://github.com/vncorenlp/VnCoreNLP) for Vietnamese. VnCoreNLP provides rich linguistic annotations through key NLP components of word segmentation, POS tagging, named entity recognition and dependency parsing.

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

<img width="1524" alt="rdrsegmenterexample" src="https://user-images.githubusercontent.com/2412555/37248300-b5104726-2522-11e8-89e6-587278e70a18.png">
